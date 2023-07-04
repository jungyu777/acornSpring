package com.gura.spring04.gallery.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gura.spring04.file.dto.FileDto;
import com.gura.spring04.gallery.dto.GalleryDto;
import com.gura.spring04.gallery.service.GalleryService;


@Controller
public class GalleryController {
	@Autowired
	private GalleryService service;
	
	//gallery 게시글의 num이 parameter get 방식으로 넘어온다.
	//detaill 페이지
	@RequestMapping(value = "/gallery/detail",method = RequestMethod.GET)
	public ModelAndView detail(ModelAndView mView,int num) {
		//캘러리 detail 페이지에 필여하 ㄴ data를num으로 가져와, ModelAndView 에 저장
		service.getDetail(mView, num);
		mView.setViewName("gallery/detail");
		return mView;
	}
	
	//gallery 사진 업로드 & DB 저장
	@RequestMapping(method = RequestMethod.POST,value = "/gallery/upload")
	public String upload(GalleryDto dto,HttpServletRequest request) {
		/**
		 * form dptj dto로 데이터 받아옴
		 * dto : caption, MultipartFile image를 가지고있다
		 * request : imagePath 만드는데 사용, session 영역의 id 가져오는데사용
		 */
		service.saveImage(dto, request);
		return "gallery/upload";
	}
	
	//gallery 사진 업로드 form 페이지로 이동
		@RequestMapping("/gallery/upload_form2")
		public String uploadForm2() {
			return "gallery/upload_form2";
		}
	
	//gallery 사진 업로드 form 페이지로 이동
	@RequestMapping("/gallery/upload_form")
	public String uploadForm() {
		return "gallery/upload_form";
	}
	
	@RequestMapping("/gallery/list")
	public String getList(HttpServletRequest request) {
		service.getList(request);
		return "gallery/list";
	}
	
}
