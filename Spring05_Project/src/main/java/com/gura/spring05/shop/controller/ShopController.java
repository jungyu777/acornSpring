package com.gura.spring05.shop.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import com.gura.spring05.shop.dto.ShopDto;
import com.gura.spring05.shop.service.ShopService;

@Controller
public class ShopController {
	@Autowired
	private ShopService service;
	
	
	
	@RequestMapping("/shop/delete")
	   public String delete(int num, HttpServletRequest request) {
		   //서비스에 삭제할 글번호와 HttpServletRequest 객체를 전달해서 해당글을 삭제 시키고
	      service.deleteContent(num, request);
	      //글 목록 보기로 리다일렉트 이동시킨다.
	      return "redirect:/shop/list";
	   }
	
	
	
	@RequestMapping(method = RequestMethod.POST,value = "/shop/ajax_upload")
	@ResponseBody
	public Map<String, Object> ajaxUpload(ShopDto dto,HttpServletRequest request){
		//서비스를 이용해서 업로드된 이미지를 저장하고
		service.saveImage(dto, request);
		//{"isSuccess":true} 형식의 json 문자열 응답
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("isSuccess", true);
		return map;
	}
	
	//shop 사진 업로드 form 페이지로 이동
		@RequestMapping("/shop/upload_form")
		public String uploadForm() {
			return "shop/upload_form";
		}
	
	//gallery 사진 업로드 & DB 저장
		@RequestMapping(method = RequestMethod.POST,value = "/shop/upload")
		public String upload(ShopDto dto,HttpServletRequest request) {
			/**
			 * form dptj dto로 데이터 받아옴
			 * dto : caption, MultipartFile image를 가지고있다
			 * request : imagePath 만드는데 사용, session 영역의 id 가져오는데사용
			 */
			service.saveImage(dto, request);
			return "shop/upload";
		}
	
	@RequestMapping(value = "/shop/detail",method = RequestMethod.GET)
	public ModelAndView detail(ModelAndView mView,int num) {
		//캘러리 detail 페이지에 필여하 ㄴ data를num으로 가져와, ModelAndView 에 저장
		service.getDetail(mView, num);
		mView.setViewName("shop/detail");
		return mView;
	}
	
	@RequestMapping("/shop/list")
	public String getList(HttpServletRequest request) {
		service.getList(request);
		return "shop/list";
	}
}
