package blueKite.com.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import blueKite.com.service.MemberService;

@Controller
public class MemberController {
	
	private String INDEX = "index";
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping("/getMemberList")
	public String getMemeberList(HttpServletRequest request) {
		
		List<String> memeberList = memberService.getMemeberList();
		String username = memeberList.get(0);
		System.out.println(username);
		request.setAttribute("username", username);
		return INDEX;
	}
	
	@RequestMapping("/getName")
	public String getName() {
		return "hongye";
	}

}
