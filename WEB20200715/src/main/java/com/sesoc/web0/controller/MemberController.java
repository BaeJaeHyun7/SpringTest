package com.sesoc.web0.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sesoc.web0.service.MemberService;
import com.sesoc.web0.vo.MemberVo;

@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	
	@RequestMapping(value = "/member/joinForm", method = RequestMethod.GET)
	public String joinForm() {
		System.out.println("회원 가입 폼 이동");
		return "member/joinForm";
	}
	
	
	@RequestMapping(value = "/member/join", method = RequestMethod.POST)
	public String MemberJoin(MemberVo member) {
		String page = memberService.MemberJoin(member);
		return page;
		
	}
	
	
	
}
