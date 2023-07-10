package com.example.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.hello.pc.Computer;
import com.example.hello.utill.Remocon;

@SpringBootApplication
public class Boot01Hello21Application {

	public static void main(String[] args) {
		//run() 메소드가 리턴해주는 ApplicationContext 객체의 참조값을 변수에 담고
		ApplicationContext ctx = SpringApplication.run(Boot01Hello21Application.class, args);
		
		
		//해당 객체로 부터 Car type 객체 얻어내기
		Car car1 = ctx.getBean(Car.class);
		car1.drive();
		//getBean() 메소드를 다시 호출해도 객체를 하나만 생성한다.
		Car car2 = ctx.getBean(Car.class);
		car2.drive();
				
		if(car1== car2) {
			System.out.println("car1과 car2는 같아요");
		}
		
		//스프링이 관리하는 객체 중에서 Remocon type 의 참조값 찾아오기
		//Remocon r1 = ctx.getBean(Remocon.class);
		//r1.up();
		//r1.down();
		
		//같은 인터페이스를 다른 클래스에서 (위에처럼)타입으로 불러올경우 스프링이 에러를낸다
		//에러를 안낼려면 밑에 처럼 그 이름으로 찾아야한다
		//스프링이 관리하는 객체 중에서 myRemocon 이라는 이름의 객체를 얻어와서 원래 type 으로 casting 해서 사용하
		Remocon r2=(Remocon)ctx.getBean("myRemocon");
		r2.up();
		r2.down();
		
		//스프링이 관리하는 객체 중에서 myTvRemocon 이라는 이름의 객체를 얻어와서 원래 type으로 casting해서 사용하기
		Remocon t1 = (Remocon)ctx.getBean("myTvRemocon");
		t1.up();
		t1.down();
		
		
		Computer com1 = ctx.getBean(Computer.class);
		com1.action();
		
	}

}
