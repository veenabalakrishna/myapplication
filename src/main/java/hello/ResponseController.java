package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseController {

	    @RequestMapping("/")
	    public String home() {
	        return "Hello, World!";
	    }

	    @RequestMapping("/app-details")
		public SampleResponse Sample(@RequestParam(value = "name", defaultValue = "java") String name) {
			SampleResponse response = new SampleResponse();
			response.setVersion("v0.1.0");
			response.setDescription("Pre-interview-codeTest");
			response.setName("application " +name);
			return response;

	    }
}	    