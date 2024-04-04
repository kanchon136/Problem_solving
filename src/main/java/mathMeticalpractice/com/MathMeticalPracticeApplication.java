package mathMeticalpractice.com;

import java.time.Duration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class MathMeticalPracticeApplication {
	
	private static final String API_MAIN_URL="http://localhost:8099/dghs-shr-ws/dghsApi";

public static void main(String[] args) {
		SpringApplication.run(MathMeticalPracticeApplication.class, args);
     }
	
@Bean	
public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.setConnectTimeout(Duration.ofMinutes(3))
				.setReadTimeout(Duration.ofMinutes(2))
				.build();
	}

@Bean
public WebClient.Builder webClientBuilder(){
	return WebClient.builder().baseUrl(API_MAIN_URL)
			.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
}

}
