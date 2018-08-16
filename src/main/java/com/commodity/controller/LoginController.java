package com.commodity.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.commodity.bean.UserBean;
import com.commodity.domain.model.User;
import com.commodity.services.LoginServices;

@Controller
public class LoginController {
	
	@Autowired
	private LoginServices loginServices;

	@RequestMapping("/index")
	public String getLofinView(Map<String, Object> model) {
		return "index";
	}

	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public String getHomeVeiw(@ModelAttribute("UserBean") UserBean userBean, HttpServletRequest request) {
		System.out.println("username :: " + userBean);
		System.out.println("value :: " + request.getParameter("username"));		
		boolean isUserExists = false;		
		if(null != userBean) {
			if(null != userBean.getUsername() && null != userBean.getPassword()) {
				isUserExists = loginServices.findUserByEmail(userBean.getUsername(), userBean.getPassword());
			}
		}
		System.out.println("Is USer Exists :: " + isUserExists);
		if(isUserExists) {
			return "home";
		}else {
			return "home";
		}
	}
}