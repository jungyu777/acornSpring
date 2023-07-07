package com.gura.spring05.client_order.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gura.spring05.client_order.dto.ClientDto;
@Repository
public class ClientDaoImpl implements ClientDao{
	@Autowired
	private SqlSession session;
	
	@Override
	public void insert(ClientDto dto) {
		
		session.insert("client.insert",dto);
	}

	@Override
	public List<ClientDto> getList(ClientDto dto) {
		
		return session.selectList("client.getList",dto);
	}

	@Override
	public ClientDto getData(int num) {
		
		return session.selectOne("client.getData");
	}

	

}
