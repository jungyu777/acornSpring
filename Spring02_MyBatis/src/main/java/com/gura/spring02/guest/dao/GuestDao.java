package com.gura.spring02.guest.dao;

import java.util.List;

import com.gura.spring02.guest.dto.GuestDto;
/**
 * 
 * 디스페처서블릿이 다 분배를해줘서 컨트롤러가 배분받은걸 리퀘스트에 담고 포워드이동해서 jsp view page로 ㄷ이동시킨다
 * @author acorn
 *
 */

public interface GuestDao {
	 void insert(GuestDto dto);
	 void update(GuestDto dto);
	 void delete(GuestDto dto);
	 GuestDto getData(int num);
	 List<GuestDto> getList();
}
