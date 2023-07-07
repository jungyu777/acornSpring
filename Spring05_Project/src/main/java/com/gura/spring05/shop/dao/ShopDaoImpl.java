package com.gura.spring05.shop.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gura.spring05.shop.dto.ShopDto;
@Repository
public class ShopDaoImpl implements ShopDao{
	@Autowired
	private SqlSession session;
	
	@Override
	public List<ShopDto> getList(ShopDto dto) {
		
		return session.selectList("shop.getList",dto);
	}

	@Override
	public int getCount() {
		
		return session.selectOne("shop.getCount");
	}

	@Override
	public void insert(ShopDto dto) {
		session.insert("shop.insert",dto);
		
	}

	@Override
	public ShopDto getData(int num) {
		
		return session.selectOne("shop.getData",num);
	}

	@Override
	public ShopDto getData(ShopDto dto) {
		// TODO Auto-generated method stub
		return session.selectOne("shop.getData",dto);
	}

	@Override
	public void addViewCount(int num) {
		session.selectOne("shop.addViewCount",num);
		
	}

	@Override
	public void delete(int num) {
		session.delete("shop.delete",num);
		
	}

}
