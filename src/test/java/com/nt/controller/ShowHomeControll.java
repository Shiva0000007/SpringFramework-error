package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowHomeControll {

	@RequestMapping("/home")
	public String showHomepage() {
		return "Welcome";
	}
}
