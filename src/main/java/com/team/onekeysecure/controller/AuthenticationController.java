package com.team.onekeysecure.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.team.onekeysecure.service.AuthenticationService;
import com.team.onekeysecure.to.AuthenticationRequest;
import com.team.onekeysecure.to.AuthenticationResponse;

@RestController
@RequestMapping("/authenticate")
public class AuthenticationController {

	private final AuthenticationService authenticationService;

	public AuthenticationController(AuthenticationService authenticationService) {
		this.authenticationService = authenticationService;
	}
	
	public AuthenticationResponse login(@RequestBody AuthenticationRequest request) {
//		String token = authenticationService.login(request);
		return new AuthenticationResponse();
	}
	
}
