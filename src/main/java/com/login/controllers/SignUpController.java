package com.login.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.login.service.SignUpDataUpdate;

@Controller
public class SignUpController {
	
	@Autowired
	public SignUpDataUpdate signUpUpdate;
	
	@RequestMapping("/call")
	public ModelAndView signUpNewUser(HttpServletRequest req, HttpServletResponse res){
		String uName=req.getParameter("uName");
		String pass = req.getParameter("pass");
		String mob = req.getParameter("mobNo");
		String view = null;
		ModelAndView mv = new ModelAndView();
		String errStatement = "";
		try {
			boolean isPersistance = signUpUpdate.userNamePersistance(uName);
			if(!isPersistance){
				if(req.getParameter("verifyPass").equalsIgnoreCase(pass)){
					if(signUpUpdate.storeData(uName,pass,mob)){
						view = "login";
					}else{
						errStatement += "failure";
						view = "error";
					}
				}else{
					errStatement += "Password must be same";
					view = "error";
				}
			}else{
				errStatement += "Username already exist";
				view = "error";
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName(view);
		mv.addObject("err", errStatement);
		return mv;
	}
}
