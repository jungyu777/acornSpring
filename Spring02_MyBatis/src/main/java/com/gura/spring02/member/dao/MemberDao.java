package com.gura.spring02.member.dao;

import java.util.List;

import com.gura.spring02.member.dto.MemberDto;

public interface MemberDao {
	
	 void insert(MemberDto dto);
	 void update(MemberDto dto);
	 void delete(int num);
	 MemberDto getData(int num);
	 List<MemberDto> getList();
	 
	 
}
