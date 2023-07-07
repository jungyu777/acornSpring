package com.gura.spring05.client.order.service;

import java.util.List;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.gura.spring05.client_order.dao.ClientDao;
import com.gura.spring05.client_order.dto.ClientDto;

@Service
public class ClientServiceImpl implements ClientService{

	@Autowired
	private ClientDao dao;
	
	@Override
	public void getList(HttpServletRequest request) {
		ClientDto dto = new ClientDto();
		List<ClientDto> list = dao.getList(dto);
		request.setAttribute("list", list);
		
		
	}

	@Override
	public void saveOrder(ClientDto dto, HttpServletRequest request) {
		String id = (String)request.getSession().getAttribute("id");
	      dto.setId(id);
		 dao.insert(dto);
		
	}

	@Override
	public void getDetail(ModelAndView mView, int num) {
		//dao로 해당 게시글 num에 해당하는 데이터 (dto)를 가져온다
		ClientDto dto = dao.getData(num);
		//ModelAndView 에 가져온 GalleryDto 를 담는다
		mView.addObject("dto",dto);
		
	}

	

	

}
