package com.gura.spring05.client_order.dao;

import java.util.List;

import com.gura.spring05.client_order.dto.ClientDto;

public interface ClientDao {
	void insert(ClientDto dto);
	List<ClientDto> getList(ClientDto dto);
	ClientDto getData(int num);
	
}
