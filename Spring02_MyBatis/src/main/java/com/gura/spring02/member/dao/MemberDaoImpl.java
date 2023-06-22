package com.gura.spring02.member.dao;
/**
 * SELECT 된 row하나를 어떤 tpe에 담을지 결정하는것이resultType = " 담을type" 설정이다.
 */
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gura.spring02.member.dto.MemberDto;
//Component scan 시 bean 이 되기위해
@Repository //빈이 되어야지만 @Autowired할수있다
public class MemberDaoImpl implements MemberDao{
	//MyBatis 를 사용하기 위한 핵심 의존객체 주입받기
	@Autowired //SqlSession 참조값을 자동연결 받겠다 
	private SqlSession session;

	@Override
	public void insert(MemberDto dto) {
		session.insert("member.insert", dto);
	}

	@Override
	public void update(MemberDto dto) {
		session.update("member.update",dto);
	}

	@Override
	public void delete(int num) {
		session.delete("member.delete",num);
	}

	@Override
	public MemberDto getData(int num) {
		
		return session.selectOne("member.getData",num);
	}

	@Override
	public List<MemberDto> getList() {
		//회원목록을 얻어솨서
		List<MemberDto> list = session.selectList("member.getList");
		//리턴해주기
		return list;
	}

}
