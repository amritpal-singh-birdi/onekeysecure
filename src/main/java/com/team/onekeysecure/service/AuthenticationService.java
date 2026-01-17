package com.team.onekeysecure.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.team.onekeysecure.interfaces.UserManager;
import com.team.onekeysecure.to.UserCreationRequest;
import com.team.onekeysecure.to.UserDetailsModificationRequest;

@Service
public class AuthenticationService {

	@Autowired
	private JwtService jwtService;
	
	@Autowired
	private UserManager userManager;
	
	public Optional<String> login(String username, String password){
		return userManager.authenticate(username, password).map(u -> jwtService.generateToken(username));
	}
	
	public UserDetails register(UserCreationRequest user) {
		return userManager.createUser(user);
	}
	
	public void changePassword(UserDetailsModificationRequest modifiedUser) {
		userManager.changePassword(modifiedUser);
	}
	
	
		
}
