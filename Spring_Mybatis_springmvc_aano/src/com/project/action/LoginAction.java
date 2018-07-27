package com.project.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.bean.UserBean;
import com.project.service.IUserService;

@Controller
public class LoginAction {
	@Autowired
	private IUserService service;
	@RequestMapping(value="/LoginAction.action")
	public ModelAndView LoginAction(UserBean user){
		
		ModelAndView model = new ModelAndView();
		boolean boo = service.login(user);
		if(boo){
			model.setViewName("success.html");
		}else{
			model.setViewName("fail.html");
		}
		return model;
	}
}
