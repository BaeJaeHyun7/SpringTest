package com.scit.web7.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.scit.web7.vo.boardVo;

public interface BoardMapper {
	
	public int boardWrite(boardVo board);
	
	public ArrayList<HashMap<String, Object>>boardList();
	
	public void boardHits(int board_no);
	
	public HashMap<String, Object>boardRead(int board_no);
	
	public int boardUpdate(boardVo board);
	
	public int boardDelete(int board_no);
	
	public ArrayList<HashMap<String, Object>>searchBoard(HashMap<String, Object>map);

}
