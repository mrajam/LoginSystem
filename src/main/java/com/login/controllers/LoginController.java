package com.login.controllers;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.login.service.CheckLoginCredentials;

/**
 * @author YAMUNA
 *CheckServlet
 */
@Controller
public class LoginController {
	
	@Autowired
	public CheckLoginCredentials checkLoginCredentials;
	
	@RequestMapping("/verify")
	public String getLoginDetails(HttpServletRequest req, HttpServletResponse res){
		String uName = req.getParameter("uName");
		String pass = req.getParameter("pass");
		String path="";
		try {
			boolean accesible = checkLoginCredentials.check(uName,pass);
			if(accesible){
				HttpSession session = req.getSession();
				session.setAttribute("uName", uName);
				session.setAttribute("pass", pass);
				path = path+"userHome";
			}else{
				path = path + "login";				
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return path;
	}
}
