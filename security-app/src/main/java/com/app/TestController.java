package com.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/")
	public String getData() {
		return "security-app";
	}
	
	@GetMapping("/user")
	public String getUserData() {
		return "security-app : user data";
	}
	
	@GetMapping("/admin")
	public String getAdminData() {
		return "security-app : admin data";
	}
	
	@GetMapping("/super")
	public String getSuperData() {
		return "security-app : super data";
	}
	
}
