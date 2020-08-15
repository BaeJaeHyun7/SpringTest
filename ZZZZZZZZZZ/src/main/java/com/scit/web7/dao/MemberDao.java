package com.scit.web7.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.web7.vo.MemberVo;

@Repository
public class MemberDao {
	
	@Autowired
	private SqlSession session;
	
	public int memberInsert(MemberVo member) {
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		int cnt = 0;
		
		try {
			cnt = mapper.memberInsert(member);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
	
	public ArrayList<MemberVo>memberSelect(){
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		ArrayList<MemberVo>list = null;
		
		try {
			list = mapper.memberSelect();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public int memberDelete(String member_id) {
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		int cnt = 0;
		
		try {
			cnt = mapper.memberDelete(member_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
	
	public MemberVo memberSelectOne(String member_id) {
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		MemberVo member = null;
		
		try {
			member = mapper.memberSelectOne(member_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return member;
	}
	
	public ArrayList<MemberVo>memberSearch(HashMap<String, String>map){
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		ArrayList<MemberVo>list = null;
		
		try {
			list = mapper.memberSearch(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public int memberUpdate(MemberVo member) {
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		int cnt = 0;
		
		try {
			cnt = mapper.memberUpdate(member);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}

}
