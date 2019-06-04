package blueKite.com.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientService {
	
	@Value("${age}")
	private String age;
	
	@Value("${userName}")
	private String userName;
	
	@RequestMapping("/getAge")
	public String getAge() {
		return age;
	}
	
	@RequestMapping("/getUserName")
	public String getUserName() {
		return userName;
	}

}
