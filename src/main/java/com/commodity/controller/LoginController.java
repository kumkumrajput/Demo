package com.commodity.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.commodity.bean.UserBean;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public String getLofinView(Map<String, Object> model) {
		return "index";
	}

	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public String getHomeVeiw(@ModelAttribute("UserBean") UserBean userBean, HttpServletRequest request) {
		System.out.println("username :: " + userBean);
		System.out.println("value :: " + request.getParameter("username"));
		return "home";
	}
}