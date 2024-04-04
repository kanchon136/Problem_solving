package mathMeticalpractice.com.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import mathMeticalpractice.com.model.Division;
import mathMeticalpractice.com.service.ApiConsumerService;
@Slf4j
@RestController
@RequestMapping("/geoCode")
public class GeoCodeController {
	@Autowired
	private ApiConsumerService apiConsumerService;
	@Autowired
	private ApplicationContext applicationContext;

@GetMapping("/allgeocodes")
public ResponseEntity<?> findAllGeoCodes(){
		try {
			return new ResponseEntity<List<Division>>(apiConsumerService.getAllGeoCodes(),HttpStatus.OK);
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

@GetMapping("/findAllUnionsByUpaziCode/{upazilaCode}")
public ResponseEntity<?> findAllUnionsByUpaziCode(@PathVariable("upazilaCode")String upazilaCode ) {
	try {
		log.info("findAllUnionByUpazilaCode size=:"+apiConsumerService.findAllUnionByUpazilaCode(upazilaCode).size());
		return new ResponseEntity<>(apiConsumerService.findAllUnionByUpazilaCode(upazilaCode),HttpStatus.OK);
	} catch (Exception e) {
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); 
	}
	
}

public ResponseEntity<?> findUnionByUniOnCode(@RequestParam(value="upacode",required = true)String upacode,
		                                     @RequestParam(value="unioncode",required = true)String unioncode){
	
	try {
		return new ResponseEntity<>(apiConsumerService.getUnionByUpaCodeAndUniCode(upacode, unioncode),HttpStatus.OK);
	} catch (Exception e) {
		return ResponseEntity.internalServerError().build(); 
	}
}


@GetMapping("/")
public String test() {
	return "Project is Running....!";
}


@GetMapping("/allBeans")
public List<String> findAllContextbean(){
	return Arrays.stream(applicationContext.getBeanDefinitionNames()).sorted()
			.collect(Collectors.toList());
}

@GetMapping("/activeProfiles")
public List<String> getAllEnvironments(){
	return Arrays.stream(applicationContext.getEnvironment().getActiveProfiles()).collect(Collectors.toList());
}

}
