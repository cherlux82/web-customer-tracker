package com.draggerco.springdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.draggerco.springdemo.dao.CustomerDAO;
import com.draggerco.springdemo.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerDAO customerDAO;

	@RequestMapping("/list")
	public String listCustomers(Model model) {
		List<Customer> l = customerDAO.getCustomers();

		model.addAttribute("customers", l);

		return "list-customers";
	}
}
