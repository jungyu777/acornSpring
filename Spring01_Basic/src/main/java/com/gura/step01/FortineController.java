package com.gura.step01;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FortineController {
	@RequestMapping("/fortune")
	public String fortune(HttpServletRequest request) {
		//오늘의 운세(모델)
		String fortuneToday="1111111111111111111111111111";
		
		//request.scope 에 응답에 필요한 데이터를 담는다.
		request.setAttribute("fortuneToday", fortuneToday);
		
		// /WEB-INF/views/fortune.jsp 페이지로 forward이동해서 응답하기
		return "fortune";
		
	}
	
	@RequestMapping("/fortune2")
	public ModelAndView fortune2() {
		//오늘의 운세(모델)
		String fortuneToday="222222222222222222222222222222222222";
		
		//HttpServletReqyest 객체 대신에 ModelAndBiew 개게를 생성해서
		ModelAndView mView =  new ModelAndView();
		//view page에 전달항 내용을 담는다
		mView.addObject("fortuneToday",fortuneToday);
		//view page 의 위치도 담는다.
		mView.setViewName("fortune");
		
		//모델과 view page 정보가 모두 담겨 있는 ModelAndView 객체를 리턴해주면 똑같이 동작한다.
		return mView;
		
	}
	
	//ModelAndView 를 매개 변수로 선언하면 스프링 프레임워크가  알아서 객체 생성후 참조값을 넣어준다.
	@RequestMapping("/fortune3")
	public ModelAndView fortune3(ModelAndView mView) {
		//오늘의 운세(모델)
		String fortuneToday="333333333333333333333333333333";
		
		
		//view page에 전달항 내용을 담는다
		mView.addObject("fortuneToday",fortuneToday);
		//view page 의 위치도 담는다.
		mView.setViewName("fortune");
		
		//모델과 view page 정보가 모두 담겨 있는 ModelAndView 객체를 리턴해주면 똑같이 동작한다.
		return mView;
		
	}
}
