package com.kh.spring.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kh.spring.member.domain.Member;
import com.kh.spring.member.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	private MemberService mService;
	
	
	/* 로그인 폼*/
	@RequestMapping(value="loginView", method=RequestMethod.GET)
	public String memberLoginView() {
		
		return "member/memberLogin";
	}
	
	/* 로그인 로직 */
	@RequestMapping(value="login", method=RequestMethod.POST)
	public String memberLogin(@ModelAttribute Member member, Model model) {
		// vo를 통해서 jsp에서 변수(name값 vo와 동일하게 지정)받아올 경우 @ModelAttribute
		
		Member mOne = new Member(member.getMemberId(), member.getMemberPwd());
		Member loginMember = mService.loginMember(mOne);
		System.out.println("로그인");
		
		if(loginMember != null) {
			System.out.println("로그인 성공");
			return "redirect:/";
		}else {
			model.addAttribute("msg", "로그인 실패");
			return "common/errorPage";
		}
		
		
	}
	
	
	
	/* 회원가입 폼 */
	@RequestMapping(value="registView", method = RequestMethod.GET)
	public String memberRegistView() {
		
		return "member/memberRegist";
	}
	
}
