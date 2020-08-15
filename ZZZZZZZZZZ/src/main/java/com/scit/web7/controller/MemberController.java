package com.scit.web7.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit.web7.service.MemberService;
import com.scit.web7.vo.MemberVo;

@Controller
@RequestMapping(value = "/member")
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@RequestMapping(value = "/joinForm",method = RequestMethod.GET)
	public String joinForm() {
		logger.info("회원가입 폼 이동");
		return "member/joinForm";
	}
	
	@RequestMapping(value = "/join",method = RequestMethod.POST)
	public String join(MemberVo member) {
		String page = service.memberInsert(member);
		return page;
	}
	
	@RequestMapping(value = "/joinFail", method = RequestMethod.GET)
	public String joinFail() {
		logger.info("회원가입 실패");
		return "member/joinFail";
	}
	
	@RequestMapping(value = "/listForm",method = RequestMethod.GET)
	public String memberSelect(Model model, HttpSession session) {
		
				String loginId = (String)session.getAttribute("loginId");
				
				String page = "";
				
				if(loginId != null) {
				ArrayList<MemberVo>list = service.memberSelect();
				model.addAttribute("list", list);
				page = "member/listForm";
				}else {
					page = "redirect:/member/loginForm";
				}
				return page;
	}
	
	@RequestMapping(value = "/memberSearch",method = RequestMethod.POST)
	public String memberSearch(String start_date,String end_date,Model model) {
		
		
		ArrayList<MemberVo> list = service.memberSearch(start_date, end_date);
		model.addAttribute("list", list);
		
		return "member/listForm";
	}
	@RequestMapping(value = "/memberSelectOne",method = RequestMethod.GET)
	public String memberSelectOne(String member_id,Model model) {
		MemberVo member = service.memberSelectOne(member_id);
		model.addAttribute("member", member);
		
		return "member/memberInfo";
	}
	
	@RequestMapping(value = "/memberDelete",method = RequestMethod.GET)
	public String memberDelete(String member_id) {
		service.memberDelete(member_id);
		return "redirect:/member/listForm";		
	}
	
	@RequestMapping(value = "/memberUpdateForm",method = RequestMethod.GET)
	public String memberUpdateForm(String member_id,Model model) {
		MemberVo member = service.memberSelectOne(member_id);
		model.addAttribute("member", member);
		
		return "member/memberUpdateForm";
	}
	
	@RequestMapping(value = "/update",method = RequestMethod.POST)
	public String update(MemberVo member) {
		service.memberUpdate(member);
		
		return "redirect:/member/listForm";
	}
	@RequestMapping(value = "/loginForm",method = RequestMethod.GET)
	public String loginForm() {
		return "member/memberLoginForm";
	}
	
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public String loginForm(MemberVo member) {
		
		String page = service.login(member);
		
		return page;
	}
	
	@RequestMapping(value = "/logout",method = RequestMethod.GET)
	public String logout() {
		
		service.logout();
		
		return "redirect:/";
	}
	

}
