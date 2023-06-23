package com.gura.spring02.member.service;



import org.springframework.web.servlet.ModelAndView;

import com.gura.spring02.member.dto.MemberDto;

public interface MemberService {
	 void memberServiceInsert(MemberDto dto);
	 void memberServiceUpdate(MemberDto dto);
	 void memberServiceDelete(int num);
	 void memberServiceGetData(ModelAndView mView, int num);
	 void memberServiceGetList(ModelAndView mView);

}
