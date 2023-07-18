package com.example.boot05;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home(HttpServletRequest request) {
		List<String> noticeList = new ArrayList<String>();
		noticeList.add("Spring Boot 시작입니다");
		noticeList.add("Spring Boot 시작입니다");
		noticeList.add("Spring Boot 시작입니다");
		
		request.setAttribute("noticeList", noticeList);
		
		return "home";
	}
	
}
