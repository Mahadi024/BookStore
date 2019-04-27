package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.domain.security.PasswordResetToken;

public interface UserService {
	PasswordResetToken getPasswordResetToken(final String token);
	
	void createPasswordResetTokenForUser(final User user, final String token);
}
