package com.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello Worlddddddd";
	}
	
	/*
	 * @RequestMapping(produces =
	 * MediaType.APPLICATION_XML,method=RequestMethod.GET, value="/details")
	 * 
	 * @ResponseBody public Customer details() { Customer cust = new Customer();
	 * cust.setAddress("india"); cust.setId(1); cust.setName("karthik"); return
	 * cust;
	 * 
	 * }
	 */
}
