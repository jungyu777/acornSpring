package com.example.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * 
 * 어떤 객체를 spring 이 생성해서 관리 할지 설정(bean 설정)
 * 
 * xml 문서로 설정하던 bean 설정을 class기반으로 한다
 *
 */

import com.example.hello.pc.Computer;
import com.example.hello.pc.Cpu;
import com.example.hello.utill.Remocon;
import com.example.hello.utill.RemoconImpl;
import com.example.hello.utill.TvRemocon;
@Configuration
public class JavaConfig {
	/**
	 * 
	 * 이 메소드에서 리턴되는 객체를 spring 이 관리하는 bean이 되도록한다.
	 * 아래의 메소드는 xml 문서에서 <bean id="myCar" Class="com.example.demo.Car"/> 와 같다
	 */
	@Bean
	public Car myCar() { //method의 이름이 bean의 이름(id) 역활을 한다.
		System.out.println("myCar() 메소드 호출됨");
		Car c1 = new Car();
		return c1;
	}
	//Remocon 인터페이스 type 이 spring이 관리하는 bean이 되도록 설정해 보세요.
	
	@Bean
	public Remocon myRemocon() { // bean의 이름은 => myRemocon
		System.out.println("Remocon 메소드 호출함");
		Remocon r1 = new RemoconImpl();
		
		return r1;
	}
	
	@Bean
	public Remocon myTvRemocon() {// bean의 이름은 => myTvRemocon
		System.out.println("myTvRemocon 메소드 호출함");
		Remocon t1 = new TvRemocon();
		return t1;
	}
	
	@Bean
	public Cpu getCpu() {
		return new Cpu();
	}
	@Bean
	public Computer myComputer() {
		//생성자에 또다른 Bean 의 참조값을 필요하면 메소드를 호출해서 얻어내면된
		Computer c1 = new Computer(getCpu());
		return c1;
	}
	
	
}
