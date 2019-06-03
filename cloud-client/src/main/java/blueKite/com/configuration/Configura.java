package blueKite.com.configuration;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Configura {
	
	@Bean
	@LoadBalanced//负载均衡
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
