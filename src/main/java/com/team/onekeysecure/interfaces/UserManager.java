package com.team.onekeysecure.interfaces;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;

import com.team.onekeysecure.to.UserCreationRequest;
import com.team.onekeysecure.to.UserDetailsModificationRequest;

public interface UserManager {
	
	Optional<UserDetails> authenticate(String userName, String password);
	
	UserDetails createUser(UserCreationRequest user);
	
	void changePassword(UserDetailsModificationRequest modifiedUser);
	
	

}
