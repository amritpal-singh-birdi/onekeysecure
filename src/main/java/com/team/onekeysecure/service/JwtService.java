package com.team.onekeysecure.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class JwtService {

	private final String SECRET = "super-secret-key";
	private final long expiryTime = 100 * 60 * 60;

	public String generateToken(String username) {
		return Jwts.builder().setSubject(username).setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis() + expiryTime))
				.signWith(SignatureAlgorithm.HS256, SECRET).compact();
	}
	
	public String extractUsername(String token) {
		return Jwts.parser().setSigningKey(SECRET).parseClaimsJws(token).getBody().getSubject();
	}
	
	public boolean isTokenValid(String token, String username) {
		return extractUsername(token).equals(username);
	}
}
