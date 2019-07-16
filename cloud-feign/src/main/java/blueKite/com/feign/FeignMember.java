package blueKite.com.feign;

import java.util.List;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient(value="member",fallback=HystrixService.class)
@Component
public interface FeignMember {
	
	@RequestMapping("/getMemberList")
	public List<String> getMemberList();

}