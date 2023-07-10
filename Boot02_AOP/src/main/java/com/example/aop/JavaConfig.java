package com.example.aop;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.example.aop.aspect.MessengerAspect;
import com.example.aop.util.MembetService;
import com.example.aop.util.Messenger;



@Configuration
@EnableAspectJAutoProxy //
public class JavaConfig {
	//Messenger 객체를 bean으로 만들기
	@Bean
	public Messenger myMessenger() {
		return new Messenger();
	}
	
	//MessengerAspect 를 bean 으로 만들기
	@Bean
	public MessengerAspect msa() {
		return new MessengerAspect();
	}
	//MembetService 를 Bean 으로 만들기
	@Bean
	public MembetService membetService() {
		return new MembetService();
	}
}
