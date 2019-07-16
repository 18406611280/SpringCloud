package blueKite.com.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import blueKite.com.service.MemberService;

@RestController
public class MemberServiceImpl implements MemberService{
	
	@Value("${age}")
	private String age;

	@Override
	@RequestMapping("/getMemberList")
	public List<String> getMemberList() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		List<String> list = new ArrayList<String>();
		list.add("hongye");
		list.add("handsome");
		list.add(age);
		return list;
	}
	
	

}
