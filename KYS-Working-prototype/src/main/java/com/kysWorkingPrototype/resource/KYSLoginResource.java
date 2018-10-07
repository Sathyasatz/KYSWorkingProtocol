package com.kysWorkingPrototype.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KYSLoginResource {

	@GetMapping(value="/KYS/doLogin")
	public String doLogin() {
		return "Logged Inn, Welcome";
	}
}
