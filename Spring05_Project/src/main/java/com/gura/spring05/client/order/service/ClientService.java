package com.gura.spring05.client.order.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

import com.gura.spring05.client_order.dto.ClientDto;


public interface ClientService {
	void getList(HttpServletRequest request);
	
	void saveOrder(ClientDto dto, HttpServletRequest request);
	
	void getDetail(ModelAndView mView,int num);
	
	
}
