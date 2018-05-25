package com.panpan.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {
    @RequestMapping("/helloworld")
	public String hello() {
		System.out.println("Hello world SpringMVC");
		return "success";
	}
}
