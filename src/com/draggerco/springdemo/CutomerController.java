package com.draggerco.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CutomerController {

	@RequestMapping("/list")
	public String listCustomers() {
		return "list-customers";
	}
}
