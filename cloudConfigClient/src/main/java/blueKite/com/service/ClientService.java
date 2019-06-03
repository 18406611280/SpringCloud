package blueKite.com.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientService {
	
	@Value(value = "${userName}")
	private String username;
	
	@RequestMapping("/getName")
	public String getName() {
		return username;
	}

}
