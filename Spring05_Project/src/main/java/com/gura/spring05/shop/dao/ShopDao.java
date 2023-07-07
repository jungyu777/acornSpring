package com.gura.spring05.shop.dao;

import java.util.List;


import com.gura.spring05.shop.dto.ShopDto;

public interface ShopDao {
	List<ShopDto> getList(ShopDto dto);
	int getCount();
	void insert(ShopDto dto);
	ShopDto getData(int num);
	
	
	ShopDto getData(ShopDto dto);
	//조회수 증가 시키기
	void addViewCount(int num);
	//글삭제
	void delete(int num);
}
