package com.yjj.spring_014_3;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {

	@RequestMapping("/")
	public String rootIndex() {
		
		return "indexRoot";
	}
	
	
	@RequestMapping(value = "/index")
	public String goIndex() {
		
		return "index";
	}
	
	
	@RequestMapping("/idCheck")
	public String idCheck(HttpServletRequest request) {
		
		String cid = request.getParameter("id");
		
		if(cid.equals("student")) {
			return "redirect:studentOk";
		}
		
		return "redirect:studentNg";
	}
	
	@RequestMapping("/studentOk")
	public String studentOk() {
		
		return "student/studentOk";
	}
	
	@RequestMapping("/studentNg")
	public String studentNg() {
		
		return "student/studentNg";
	}
	
	@RequestMapping("/test")
	public String redirectTest() {
		
		return "redirect:http://localhost:8181/spring_014_3/test2";
	}
	
	@RequestMapping("/test2")
	public String redirectTest2() {
		
		return "redirectTest";
	}
	
	
}
