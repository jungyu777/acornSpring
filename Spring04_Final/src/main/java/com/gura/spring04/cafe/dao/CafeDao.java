package com.gura.spring04.cafe.dao;

import java.util.List;

import com.gura.spring04.cafe.dto.CafeDto;

public interface CafeDao {
	//글목록
	List<CafeDto> getList(CafeDto dto);
	//글의 갯수
	int getCount(CafeDto dto);
	//글추가
	void insert(CafeDto dto);
	//글정보 얻어오기
	CafeDto getData(int num);
	//키워드를 활용한 글정보 얻어오기(키워드에 부합하는 글중에서 이전글, 다음글의 글번호도 얻어올수 있도록)
	CafeDto getData(CafeDto dto);
	//조회수 증가 시키기
	void addViewCount(int num);
	//글삭제
	void delete(int num);
	//글수정
	void update(CafeDto dto);
}
