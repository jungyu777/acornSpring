package com.example.boot06.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.boot06.interceptor.LoginInterceptor;
/**
 * [Spring MVC 관련 설정]
 * 
 * 1.WebMvcConfigurer 인터페이스를 구현한다.
 * 2.설정에 필요한 메소드만 오버라이딩한다.
 * 주로 Resource Handler, Interceptor , view page 관련 설정을 여기서 한다.
 * 3.설정에 관련된 클래스에는 @Configuration 에노테이션을 붙여야 한다.
 *
 *	리턴타입이 자신의 참조값을 리턴해주면 ...점을 계속찍으면서 호출할수있다  체인형태의 메소드
 *	
 *	
 */
@Configuration
public class WebConfig implements WebMvcConfigurer{
	
	//주입해줄 로그인 인터셉터
	@Autowired LoginInterceptor loginInter;
	
	
	//Interceptor 를 추가할떄 오버라이드 하는 메소드
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//메소드 인자로 전달되는 InterceptorRegistry 객체를 이용해서 Interceptor 를 등록하면된다.
		//로그인 인터셉터로 생성된 빈이 아래 코드에 전달되어야한다
		registry.addInterceptor(loginInter)
		.addPathPatterns("/users/*")
		.excludePathPatterns("/users/loginform")
		.excludePathPatterns("/users/login");
	}
	//webapp/resources 폴더 설정
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
		
	}
	
	
}
