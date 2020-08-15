package com.scit.web7.service;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit.web7.dao.MemberDao;
import com.scit.web7.dao.MemberMapper;
import com.scit.web7.vo.MemberVo;

@Service
public class MemberService {
	
	@Autowired
	private MemberDao dao;
	
	@Autowired
	private HttpSession session;

	public String memberInsert(MemberVo member) {
		
		int cnt = dao.memberInsert(member);
		String page = "";
		
		if (cnt == 0) {
			page = "redirect:/member/joinFail";
		}else {
			page = "redirect:/";
		}
		
		return page;
	}
	
	public ArrayList<MemberVo>memberSelect(){
		
		ArrayList<MemberVo> list = dao.memberSelect();
		
		return list;
	}
	
	public int memberDelete(String member_id) {
		
		int cnt = dao.memberDelete(member_id);
		
		return cnt;
	}
	
	public MemberVo memberSelectOne(String member_id) {
		
		MemberVo member =dao.memberSelectOne(member_id);
			
		return member;
	}
	
	public ArrayList<MemberVo> memberSearch(String start_date,String end_date){
		
		HashMap<String, String>map = new HashMap<String, String>();
		map.put("start_date", start_date);
		map.put("end_date", end_date);
		
		ArrayList<MemberVo> list = dao.memberSearch(map);
		
		return list;
	}
	
	public int memberUpdate(MemberVo member) {
		
		int cnt = dao.memberUpdate(member);
		
		return cnt;
		
	}
	
	public String login(MemberVo member) {
		
		MemberVo loginCheck = dao.memberSelectOne(member.getMember_id());
		String page = "";
		
		if(loginCheck != null && loginCheck.getMember_pw().equals(member.getMember_pw())) {
			session.setAttribute("loginId", member.getMember_id());
			page = "redirect:/";
		}else {
			page = "redirect:/member/loginForm";
		}
		return page;
	}
	
	public void logout() {
		session.removeAttribute("loginId");
	}
}
