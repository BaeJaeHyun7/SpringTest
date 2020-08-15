package com.sesoc.web0.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesoc.web0.vo.MemberVo;

@Service
public class MemberService {


	
	//DB의 역할을 잠시동안 대신해줄 list
	public ArrayList<MemberVo> list = new ArrayList<MemberVo>();
	
	public String MemberJoin(MemberVo member) {
		//DAO에 member를 전달하는 문장으로 바뀔예정
		list.add(member);
		
		//DB로부터 돌려받은 값이라고 가정
		int cnt = 1;
		
		for(MemberVo v : list) {
			System.out.println(v);
		}
		
		String page = "";
		
		if(cnt == 0) {
			page = "member/joinFail";
		}else {
			page = "member/joinComplete";
		}
		
		return page;
		
	}
	
	
}
