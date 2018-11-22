package com.example.demo.modules.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
	@RequestMapping("/index")
	public String index() {
		String reString = "欢迎来到controler!";
		return reString;
	}
}
