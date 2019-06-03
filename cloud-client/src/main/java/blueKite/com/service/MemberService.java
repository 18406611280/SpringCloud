package blueKite.com.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class MemberService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	//引入降级方法
	@SuppressWarnings("unchecked")
	@HystrixCommand(fallbackMethod = "listError")
	public List<String> getMemeberList() {
		return restTemplate.getForObject("http://member/member/getMemberList", List.class);
	}
	
	//降级调用方法
	public List<String> listError() {
		List<String> listUser = new ArrayList<String>();
		listUser.add("not memberUser list");
		return listUser;
	}

}
