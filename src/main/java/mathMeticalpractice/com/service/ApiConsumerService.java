package mathMeticalpractice.com.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;
import mathMeticalpractice.com.model.Division;
import mathMeticalpractice.com.model.Union;

@Service
@Slf4j
public class ApiConsumerService {

@Autowired
private RestTemplate restTemplate;
	
private static final String API_MAIN_URL="http://localhost:8099/dghs-shr-ws/dghsApi";


public List<Division> getAllGeoCodes(){
//ResponseEntity<Division[]> allGeocodes = restTemplate.exchange(API_MAIN_URL+"/allGeocods", HttpMethod.GET,null, Division[].class);
	ResponseEntity<List<Division>> responseEntity = restTemplate.exchange(
            API_MAIN_URL + "/allGeocods",
            HttpMethod.GET,
            null,
            new ParameterizedTypeReference<List<Division>>() {});
	
	if(responseEntity.getStatusCode().is2xxSuccessful()) {
		return responseEntity.getBody();
	}
	return null;
	
}

public List<Union> findAllUnionByUpazilaCode(String upazilaCode) {
    return getAllGeoCodes().stream()
            .flatMap(division -> division.getDistList().stream())
            .flatMap(district -> district.getUpazillaList().stream())
            .filter(upazila -> upazila.getUpazillaCode().equals(upazilaCode))
            .flatMap(upazila -> upazila.getUnionList().stream())
            .distinct()  // Remove duplicate Union objects
            .collect(Collectors.toList());
}
 
 
 public Union getUnionByUpaCodeAndUniCode(String upaCode,String unionCode) {
	 return getAllGeoCodes().parallelStream().flatMap(div-> div.getDistList().parallelStream())
			 .flatMap(dis->dis.getUpazillaList().parallelStream()).filter(f->f.getUpazillaCode().equals(upaCode))
			 .flatMap(uni->uni.getUnionList().parallelStream()).filter(u->u.getUnionCode().equals(unionCode))
			 .findFirst().orElse(null);
	 
 }


}
