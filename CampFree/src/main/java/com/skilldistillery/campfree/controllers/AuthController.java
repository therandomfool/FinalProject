package com.skilldistillery.campfree.controllers;

import java.security.Principal;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.campfree.entities.User;
import com.skilldistillery.campfree.services.AuthService;

@RestController
//@RequestMapping("api")
@CrossOrigin({"*", "http://localhost:4210"})
public class AuthController {
	
	@Autowired
	private AuthService authService;
	
	@PostMapping("/register")
	public User register(@RequestBody User user, HttpServletResponse res) {
		
		if (user == null) {
			res.setStatus(400);
		}
		
		user = authService.register(user);
		
		return user;
		
	}
	
	@GetMapping(path = "/authenticate")
	public Principal authenticate(Principal principal) {
	    return principal;
	}

}
