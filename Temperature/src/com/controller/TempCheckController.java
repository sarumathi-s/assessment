package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.beans.Temperature;

public class TempCheckController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		int temp=Integer.parseInt(req.getParameter("temp"));
		
		ModelAndView mav=null;
		
		
//		Temperature t=new Temperature(temp);
		float f=(float)((temp*1.8)+32);
		mav=new ModelAndView("index","far",f);
		
		return mav;
	}

}
