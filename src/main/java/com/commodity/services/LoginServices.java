package com.commodity.services;

public interface LoginServices {
	
	public boolean findUserByEmail(final String email, final String password);

}
