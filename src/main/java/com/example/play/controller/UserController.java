package com.example.play.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.play.domain.User;
import com.example.play.service.UserService;

@RestController
@RequestMapping("/testBoot")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/getUser")
	public String GetUser() {
		User sel=userService.Sel();
		return sel.toString();
	}
}
