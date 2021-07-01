package com.kh.spring.member.service.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.spring.member.domain.Member;
import com.kh.spring.member.service.MemberService;
import com.kh.spring.member.store.MemberStore;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberStore mStore;

	
	// 로그인
	@Override
	public Member loginMember(Member mOne) {
		System.out.println("로그인 서비스");
		return mStore.selectMember(mOne);
	}
	
}
