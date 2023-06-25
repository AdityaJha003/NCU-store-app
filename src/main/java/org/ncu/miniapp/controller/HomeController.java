package org.ncu.miniapp.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.ncu.miniapp.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@ModelAttribute("User")
	public User getUserEntity() {
		return new User();
	}

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
}
