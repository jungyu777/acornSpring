package com.example.boot04;

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
	@GetMapping("/fortune")
	public ModelAndView fortune(ModelAndView mView) {
		String fortuneToday = "오늘 비존나오네";
		
		mView.addObject("fortuneToday",fortuneToday);
		mView.setViewName("fortune");
		return mView;
		/**
		 *  모델엔뷰를 리턴해주면 알아서 리퀘스트해서 담아준다
		 */
	}
	@GetMapping("/fortune2")
	public String fortune2(HttpServletRequest request) {
		String fortuneToday = "오늘 비존나오네";
		
		request.setAttribute("fortuneToday", fortuneToday);
		return "fortune";
	}
}
