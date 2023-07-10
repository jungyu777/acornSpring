package com.example.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import org.springframework.stereotype.Component;


@Aspect
@Component //bean으로 만들기 
public class WritingAspect {
	
	/**
	 * 횡단 관심사 cross concern
	 * spring 이 관리하는 bean 의 메소드가 수행되기 이전(Before)에 적용되는 Aspect
	 * [메소드의 pattern]
	 * 리턴 type => void 
	 * 메소드명=>writer로 시작하는 메소드
	 * 메소드의 매개변수 => 없음
	 * 
	 * Aspect 가 적용되는 위치를 "point cut "이라고 부른다.
	 */
	//리턴타입은 보이드고 메소드명 write*()) 로 시작하는 메소드를 모두 실행하기 이전에 prepaer 메소드를 적용해라
	@Before("execution(void write*())") 
	public void prepaer() {
		System.out.println("파란색 Pen 을 준비해요!!");
	}
	/**
	 * spring 이 관리하는 bean 의 메소드가 수행되고 난후(After)에 적용되는 Aspect
	 * [메소드의 pattern]
	 * 리턴 type => void 
	 * 메소드명=>writer로 시작하는 메소드
	 * 메소드의 매개변수 => 없음
	 */
	@After("execution(void write*())")
	public void end() {
		System.out.println("Pen 을 닫고 마무리 해요!");
	}
}
