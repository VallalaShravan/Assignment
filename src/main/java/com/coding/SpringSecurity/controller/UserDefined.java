package com.coding.SpringSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserDefined {
	org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(UserDefined.class);
	@GetMapping("/loginData")
	@ResponseBody
	public String getLogin() {
		log.warn("we are in loginData responseBody");
		return "Hey ! Hello ";
	}

}
