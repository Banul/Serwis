package com.service.electronic_service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;


@Controller
public class IndexController {

	@RequestMapping(value = {"/menustrony","/lodowka","/komputer","/kuchenka","/pralka","/telewizor"}, method = RequestMethod.GET )
	public String index() {		
		System.out.println("menuStrony controller");
		return "forward:/index.html";	
		}
	

	
}
