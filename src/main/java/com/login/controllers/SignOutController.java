package com.login.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SignOutController {
		@RequestMapping("/remove")
		public String removeSession(HttpServletRequest req, HttpServletResponse res){
			HttpSession session = req.getSession();
			session.removeAttribute("uName");
			return "login";
		}
}
