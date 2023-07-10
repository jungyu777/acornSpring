package com.example.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.example.aop.util.MemberDto;

@Aspect
@Component
public class MemberAspect {
	
	@Around("execution(com.example.aop.util.MemberDto get*(..))")
	public Object checkMember(ProceedingJoinPoint joinPoint)throws Throwable {
		//aspect 가 적용된 메소드를 수행하고 리턴되는 값을(참조값) 받아온다 
		Object obj=joinPoint.proceed(); 
				
		//원래 type 으로 casting 해서 조사해 볼수가 있다.
		MemberDto a = (MemberDto)obj;
		
		a.setNum(1);
		a.setName("감구라");
		a.setAddr("노량진");
		// joinPoint.proceed() 메소드가 리턴한 참조갑을 그대로 리턴해준다.
		return a;
	}
}
