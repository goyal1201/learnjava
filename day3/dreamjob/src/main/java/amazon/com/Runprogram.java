package amazon.com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Runprogram {
	
	@GetMapping(value = "/com.job") 
	
	String Message() {
		return "hey how are u ?";

	}
}
