package com.example.boot05;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Boot05MyBatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(Boot05MyBatisApplication.class, args);
		
		//강제로 로컬호스트9000번 띄우는 코드
		Runtime rt = Runtime.getRuntime();
        try {
            rt.exec("cmd /c start chrome.exe http://localhost:9000/boot05");
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}

}
