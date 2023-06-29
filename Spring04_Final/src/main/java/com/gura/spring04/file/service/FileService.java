package com.gura.spring04.file.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

import com.gura.spring04.file.dto.FileDto;

public interface FileService {
	//파일 목록 얻어오기
	void getList(HttpServletRequest request);
	//어로드된 파일 저장하기
	void saveFile(FileDto dto, ModelAndView mView,HttpServletRequest requset);
	//파일 하나의 정보 얻어오기
	void getFileData(int num,ModelAndView mView);
	//파일 삭제하기
	void deleteFile(int num, HttpServletRequest request);
}
