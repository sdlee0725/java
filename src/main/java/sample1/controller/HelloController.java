package sample1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/")
	public String hello() {
		//return "Hello World2!";
		//return "Hello World3!";
		//return "Hello World4!";
		//return "Hello new World5!";

		return "Hello World5!";

	}
}