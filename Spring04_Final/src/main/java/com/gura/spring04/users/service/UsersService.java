package com.gura.spring04.users.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


import com.gura.spring04.users.dto.UsersDto;

public interface UsersService {
		void addUser(UsersDto dto);
		void loginProcess(UsersDto dto, HttpSession session);
		void getInfo(HttpSession session, ModelAndView mView);
		void updateUserPwd(HttpSession session, UsersDto dto, ModelAndView mView);
public  Map<String, Object> saveProfileImage(HttpServletRequest request, 
		         MultipartFile mFile);
		void updateUser(UsersDto dto, HttpSession session);
		void deleteUser(HttpSession session, ModelAndView mView);
}
