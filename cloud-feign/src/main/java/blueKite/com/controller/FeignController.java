package blueKite.com.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import blueKite.com.feign.FeignMember;
@RestController
public class FeignController {
	
private int num;
	
	@Autowired
	private FeignMember feignMember;
	
	@RequestMapping("/getMemberList")
	public List<String> getMember(){
			num++;
			System.out.println(num);
			return feignMember.getMemberList();
	}
	
	@RequestMapping("/getName")
	public String getName() {
		return "fuckMan";
	}

}
