package com.kh.spring.member.store.logic;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring.member.domain.Member;
import com.kh.spring.member.store.MemberStore;

@Repository
public class MemberStoreLogic implements MemberStore {

	@Autowired
	private SqlSessionTemplate sqlSession;

	
	// 로그인
	@Override
	public Member selectMember(Member mOne) {
		System.out.println("로그인 스토어");
		return sqlSession.selectOne("memberMapper.loginMember", mOne);
	}
	
	
}
