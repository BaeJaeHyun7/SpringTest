package com.scit.web7.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.scit.web7.vo.MemberVo;

public interface MemberMapper {
	
	public int memberInsert(MemberVo member);
	
	public ArrayList<MemberVo>memberSelect();
	
	public int memberDelete(String member_id);
	
	public MemberVo memberSelectOne(String member_id);
	
	public ArrayList<MemberVo>memberSearch(HashMap<String, String>map);
	
	public int memberUpdate(MemberVo member);

}
