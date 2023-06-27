package com.gura.spring04.users.controller;

import java.net.URLEncoder;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gura.spring04.users.dto.UsersDto;
import com.gura.spring04.users.service.UsersService;

import oracle.net.aso.m;

@Controller
public class UsersController {
	@Autowired
	private UsersService service;
	
	//비밀번호 수정 요청 처리
	@RequestMapping("/users/pwd_update")
	public ModelAndView pwdUpdate(UsersDto dto,ModelAndView mView, HttpSession session) {
		//서비스에 필요한 객체의 참조값을 전달해서 비밀번호 수정 로직을 처리한다.
		service.updateUserPwd(session, dto, mView);
		//view page로 forward 이동해서 작업결과를 응답한다.
		mView.setViewName("users/pwd_update");
		return mView;
	}
	
	
	//비밀번호 수정폼 요청처리
	@RequestMapping("/users/pwd_updateform")
	public String pwdUpdateForm() {
		return "users/pwd_updateform";
	}
	
	
	//개인정보 보기 요청 처리
	@RequestMapping("users/info")
	public ModelAndView info(HttpSession session,ModelAndView mView) {
		service.getInfo(session,mView);
		
		mView.setViewName("users/info");
		return mView;
	}
		
	
	
	//로그아웃 요청 처리
	@RequestMapping("/users/logout")
	public String logout(HttpSession session) {
		//세션에서 id라는 키값으로 저장된 값 삭제
		session.removeAttribute("id");
		return "users/logout";
	}
	
	//로그인 폼 요청 처리
	@RequestMapping("/users/login")
	public ModelAndView login(ModelAndView mView,UsersDto dto,String url,HttpSession session) {
		/**
		 * 서비스에서 비지니스 로직을 처리할떄 필요로 하는 객체를 컨트롤러에서 집적 전달을 해주어야한다
		 * 주로 HttpServletRequest, HttpServletResponse , HttpSession, ModelAndView
		 * 등등의 객체이다
		 */
		service.loginProcess(dto, session);
		
		//로그인 후에 가야할 목적지 정보를 인코딩 하지 않는것과 인코딩 한것을 모두 ModelAndBiew 객체에 담고
		String encodedUrl = URLEncoder.encode(url);
		mView.addObject("url",url);
		mView.addObject("encodedUrl",encodedUrl);
		//view page로 for ward 이동해서 응답한다.
		mView.setViewName("users/login");
		return mView;
		
	}
	
	//로그인 폼 요청 처리
	@RequestMapping(method = RequestMethod.GET,value = "/users/loginform")
	public String loginForm() {
		return "users/loginform";
	}
	
	//회원가입 요청처리
	@RequestMapping(method = RequestMethod.POST,value = "/users/signup")
	public ModelAndView signup(ModelAndView mView,UsersDto dto) {
		//서비스를 이용해서 DB에 저장하고
		service.addUser(dto);
		//view page로 forward 이동해서 응답
		mView.setViewName("users/signup");
		return mView;
	}
	
	
	/**
	 * GET 방식 /users/signup_form 요청을 처리할 메소드 - 요청 방식이 다르면 실행되지 않는다.
	 */
	
	@RequestMapping(method = RequestMethod.GET,value = "users/signup_form")
	public String signupForm() {
		
		return "users/signup_form";
	}
}
