package com.gura.spring04.cafe.service;

import javax.servlet.http.HttpServletRequest;

import com.gura.spring04.cafe.dto.CafeCommentDto;
import com.gura.spring04.cafe.dto.CafeDto;

public interface CafeService {
	void getList(HttpServletRequest requset);
	void getDetall(HttpServletRequest requset);
	void saveContent(CafeDto dto);
	void updateContent(CafeDto dto);
	void deleteContent(int num, HttpServletRequest requset);
	void getData(HttpServletRequest requset); //글 수정하기 위해 정보 불러오는 ㅣ
	
	
	void saveComment(HttpServletRequest request);//댓글저장
	void deleteComment(HttpServletRequest request);//댓글 삭제
	void updateComment(CafeCommentDto dto); //댓글수정
	void moreCommentList(HttpServletRequest request);//댓글 더보기 기능
}
