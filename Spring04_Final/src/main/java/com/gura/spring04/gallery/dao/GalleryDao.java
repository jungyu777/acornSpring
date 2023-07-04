package com.gura.spring04.gallery.dao;

import java.util.List;

import com.gura.spring04.gallery.dto.GalleryDto;

public interface GalleryDao {
	//gallery 리스트 가져오기
	List<GalleryDto> getList(GalleryDto dto);
	//모든 Row 의 개수
	int getCount();
	//갤러리에 사진 저장하기
	void insert(GalleryDto dto);
	//pk num 에 해당하는 DB에서 gallery 게시글 하나의 data 가져오기
	GalleryDto getData(int num);
}
