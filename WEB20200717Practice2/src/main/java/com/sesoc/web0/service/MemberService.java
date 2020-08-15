package com.sesoc.web0.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.sesoc.web0.vo.MemberVo;

@Service
public class MemberService {
	
	ArrayList<MemberVo> list = new ArrayList<MemberVo>();
	
	public String join(MemberVo member) {
		
		int cnt = 1;
		String page = "";
		boolean flag = false;
		
		for(MemberVo v : list) {
			
			if(v.getId().equals(member.getId())) {
				cnt = 0;
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			list.add(member);
		}
		
		if(cnt == 0) {
			page = "/member/joinFail";
		}else {
			page = "/member/joinComplete";			
		}	
		
		return page;
	}
	
	public ArrayList<MemberVo> memberList(){
		
		return list;
	}
	
	public void memberDelete(String id) {
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId().equals(id)) {
				list.remove(i);
			}
		}
		
	}
	
	

}
