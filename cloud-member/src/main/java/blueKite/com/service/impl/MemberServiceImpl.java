package blueKite.com.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import blueKite.com.service.MemberService;

@RestController
public class MemberServiceImpl implements MemberService{

	@Override
	@RequestMapping("/getMemberList")
	public List<String> getMemberList() {
		List<String> list = new ArrayList<String>();
		list.add("hongye");
		list.add("handsome");
		return list;
	}

}
