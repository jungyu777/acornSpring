package com.gura.spring02.member.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.gura.spring02.member.dao.MemberDao;
import com.gura.spring02.member.dto.MemberDto;
@Service
public class MemberServiceImpl implements MemberService{
	@Autowired
	private MemberDao dao;

	@Override
	public void memberServiceInsert(MemberDto dto) {
		dao.insert(dto);
		
	}

	@Override
	public void memberServiceUpdate(MemberDto dto) {
		dao.update(dto);
		
	}

	@Override
	public void memberServiceDelete(int num) {
		dao.delete(num);
		
	}

	@Override
	public void memberServiceGetData(ModelAndView mView, int num) {
		MemberDto dto = dao.getData(num);
		mView.addObject("dto", dto);
	}

	@Override
	public void memberServiceGetList(ModelAndView mView) {
		List<MemberDto> list = dao.getList();
		mView.addObject("list", list);
		
	}
	
	

}
