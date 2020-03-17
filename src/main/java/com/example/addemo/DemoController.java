package com.example.addemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DemoController {
	
	@RequestMapping("/demo")
	public String demo() {
		return "login success";
	}

}
