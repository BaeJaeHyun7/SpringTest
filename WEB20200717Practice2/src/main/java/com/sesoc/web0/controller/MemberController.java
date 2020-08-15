package com.sesoc.web0.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sesoc.web0.service.MemberService;
import com.sesoc.web0.vo.MemberVo;

@Controller
public class MemberController {
	
	
	@Autowired
	private MemberService memberService;
	
	
	@RequestMapping(value = "/member/joinForm",method = RequestMethod.GET)
	public String joinForm() {
		System.out.println("회원가입 폼으로 이동");
		return "member/joinForm";
	}
	
	@RequestMapping(value = "/member/join", method = RequestMethod.POST)
	public String join(MemberVo member) {
		String page = memberService.join(member);
		return page;
	}
	
	@RequestMapping(value = "/member/delete", method = RequestMethod.GET)
	public String memberDelete(String id, Model model) {
		
		ArrayList<MemberVo> list = memberService.memberList();
		memberService.memberDelete(id);
		model.addAttribute("list", list);
		
		return "member/listForm";
	}
	
	@RequestMapping(value = "/member/listForm", method = RequestMethod.GET)
	public String listForm(Model model) {
		
		ArrayList<MemberVo> list = memberService.memberList();
		model.addAttribute("list", list);		
		
		return "member/listForm";
	}

}

