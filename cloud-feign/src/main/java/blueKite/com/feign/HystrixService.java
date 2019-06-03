package blueKite.com.feign;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
@Component
public class HystrixService implements FeignMember{

	@Override
	public List<String> getMemberList() {
		List<String> list = new ArrayList<String>();
		list.add("not hash member");
		return list;
	}

}
