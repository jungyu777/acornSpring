package com.gura.spring04.cafe.dao;

import java.util.List;

import com.gura.spring04.cafe.dto.CafeCommentDto;

public interface CafeCommentDao {
	//댓글목록 얻어오기
	List<CafeCommentDto> getList(CafeCommentDto dto);
	//댓글삭제
	void delete(int num);
	//댓글추가
	void insert(CafeCommentDto dto);
	//추가할 댓글의 글번호를 리턴하는 메소드
	int getSequence();
	//댓글수정
	void update(CafeCommentDto dto);
	//댓글 하나의 정보를 리턴하는 메소드
	CafeCommentDto getData(int num);
	//댓글의 갯수를 리턴하는 메소드
	int getCount(int ref_group);
}
