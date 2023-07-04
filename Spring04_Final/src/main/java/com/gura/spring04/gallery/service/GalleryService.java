package com.gura.spring04.gallery.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

import com.gura.spring04.gallery.dto.GalleryDto;

public interface GalleryService {
	//갤러리의  list 가져오기
	void getList(HttpServletRequest request);
	//갤러리 사진 upload and DB에 저장하기
	void saveImage(GalleryDto dto, HttpServletRequest request);
	//갤러리 detail페이지에 필요한 data ModelAndView 에 저장
	void getDetail(ModelAndView mView,int num);
}
