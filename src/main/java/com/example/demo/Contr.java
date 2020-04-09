package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Contr {

	@RequestMapping("/home")
	public String home() {
		return "home.jsp";
		
	}
	@RequestMapping("/login")
	public String login() {
		return "login.jsp";
		
	}
	@RequestMapping("/logout-sucess")
	public String logout() {
		return "logout.jsp";
		
	}
}
