package com.tj.thirstyCatWeb;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	//Example code: Iinject variable/property/etc from application.properties
	//@Value("${welcome.message:test}")
	private String message = "";
	
	@GetMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message",  this.message);
		return "welcome";
	}
	
	
}
