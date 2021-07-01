package com.kh.spring.member.store;

import com.kh.spring.member.domain.Member;

public interface MemberStore {

	// 로그인
	Member selectMember(Member mOne);
	// 회원가입
	
}
