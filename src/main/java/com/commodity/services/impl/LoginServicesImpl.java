package com.commodity.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commodity.domain.model.User;
import com.commodity.domain.repository.LoginRepository;
import com.commodity.services.LoginServices;

@Service
public class LoginServicesImpl implements LoginServices {

	@Autowired
	private LoginRepository loginRepository;

	@Override
	public boolean findUserByEmail(String email, String password) {
		System.out.println("email :: " + email);
		System.out.println("password :: " + password);
		Iterable<User> user = null;
		boolean isUserExists = false;
		if (null != email && !email.isEmpty()) {
			try {
				/*user = loginRepository.findUserByEmail(email);*/
				user = loginRepository.findAll();
				System.out.println("sdafdsf" + user);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			/*if(null != user) {
				if(null != user.getPassword() && !user.getPassword().isEmpty() && null != user.getLock() && "N".equalsIgnoreCase(user.getLock())) {
					isUserExists = true;
				}
			}*/
		}
		return isUserExists;
	}
}
 