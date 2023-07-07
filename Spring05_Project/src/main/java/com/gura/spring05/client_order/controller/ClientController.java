package com.gura.spring05.client_order.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gura.spring05.client.order.service.ClientService;
import com.gura.spring05.client_order.dto.ClientDto;

@Controller
public class ClientController {
	
	@Autowired
	private ClientService service;
	
	
	@RequestMapping(value = "/client/detail",method = RequestMethod.GET)
	public ModelAndView detail(ModelAndView mView,int num) {
		//캘러리 detail 페이지에 필여하 ㄴ data를num으로 가져와, ModelAndView 에 저장
		service.getDetail(mView, num);
		mView.setViewName("client/detail");
		return mView;
	}
	
	@RequestMapping("/client/upload_form")
	public String uploadForm() {
		return "client/upload_form";
	}
	
	@RequestMapping("/client/upload")
	public String upload(ClientDto dto,HttpServletRequest request) {
		service.saveOrder(dto, request);
		return "client/upload";
	}
	
	@RequestMapping("/client/list")
	public String getList(HttpServletRequest requset) {
		service.getList(requset);
		return "client/list";
	}
	
}
