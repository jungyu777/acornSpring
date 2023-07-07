package com.gura.spring05.shop.service;

import javax.servlet.http.HttpServletRequest;


import org.springframework.web.servlet.ModelAndView;


import com.gura.spring05.shop.dto.ShopDto;

public interface ShopService {
	void getList(HttpServletRequest request);
	//갤러리 사진 upload and DB에 저장하기
	void saveImage(ShopDto dto, HttpServletRequest request);
	//갤러리 detail페이지에 필요한 data ModelAndView 에 저장
	void getDetail(ModelAndView mView,int num);
	void saveContent(ShopDto dto);
	void updateContent(ShopDto dto);
	void deleteContent(int num, HttpServletRequest requset);
}
