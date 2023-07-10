package com.example.aop.util;

import org.springframework.stereotype.Component;

/**
 * @Component 를 붙이면 생성자 새로운 생성자가 생성된다
 * 
 *    -Aspectj Expression
 * 
 *    1. execution(* *(..)) => 접근 가능한 모든 메소드가 
 *       point cut
 *    2. execution(* test.service.*.*(..)) 
 *       => test.service 패키지의 모든 메소드 point cut
 *    3. execution(void insert*(..))
 *       =>리턴 type 은 void 이고 메소드명이 
 *       insert 로 시작하는 모든 메소드가 point cut
 *    4. execution(* delete*(*))
 *       => 메소드 명이 delete 로 시작하고 인자로 1개 전달받는 
 *      메소드가 point cut (aop 가 적용되는 위치)
 *    5. execution(* delete*(*,*))
 *       => 메소드 명이 delete 로 시작하고 인자로 2개 전달받는 
 *      메소드가 point cut (aop 가 적용되는 위치)
 * 	 6. execution(String update*(Integer,*))
 *      => 메소드 명이 update 로 시작하고 리턴 type 은 String
 *      메소드의 첫번째 인자는 Integer type, 두번째 인자는 아무 type 다되는 
 *      메소드가 point cut (aop 가 적용되는 위치)
 */
 

@Component
public class WritingUtil {
	//생성자
	public WritingUtil() {
		System.out.println("WritingUtil 생성자");
	}
	
	public void writeLetter() {
		
		System.out.println("편지를 써요");
		
	}
	public void writeReport() {
		
		System.out.println("보고서를 써요");
		
	}
	public void writeDiary() {
		
		System.out.println("일기를 써용");
		
	}
}
