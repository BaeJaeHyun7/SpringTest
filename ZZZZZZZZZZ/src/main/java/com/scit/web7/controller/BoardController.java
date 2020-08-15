package com.scit.web7.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.scit.web7.service.BoardService;
import com.scit.web7.vo.boardVo;

@Controller
@RequestMapping(value = "/board")
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	
	@RequestMapping(value = "/boardList",method = RequestMethod.GET)
	public String boardList(String searchText,String searchType,Model model) {
		
	ArrayList<HashMap<String, Object>>list = service.boardList();	
	model.addAttribute("list", list);	
		
		return "board/boardList";
	}
	
	@RequestMapping(value = "/boardWriteForm",method = RequestMethod.GET)
	public String boardWriteForm() {
		
		
		return "board/boardWriteForm";
	}
	@RequestMapping(value = "/boardWrite",method = RequestMethod.POST)
	public String boardWrite(boardVo board) {
		
		service.boardWrite(board);
		
		return "redirect:/board/boardList";
	}
	
	@RequestMapping(value = "/boardRead",method = RequestMethod.GET)
	public String boardRead(int board_no,Model model) {
		
		HashMap<String, Object> map = service.boardRead(board_no);
		model.addAttribute("map", map);
		return "board/boardRead";
	}
	
	@RequestMapping(value = "/boardDelete",method = RequestMethod.GET)
	public String boardDelete(int board_no) {
		int cnt = service.boardDelete(board_no);		
		return "redirect:/board/boardList";
	}
	
	@RequestMapping(value = "/boardUpdateForm",method = RequestMethod.GET)
	public String boardUpdateForm(int board_no,Model model) {

		HashMap<String, Object> map = service.boardRead(board_no);
		model.addAttribute("map", map);
		return "board/boardUpdateForm";
	}
	
	@RequestMapping(value = "/boardUpdate",method = RequestMethod.POST)
	public String boardUpdate(boardVo board) {
		int cnt = service.boardUpdate(board);		
		
		return "redirect:/board/boardList";
	}
	
	@RequestMapping(value = "/searchBoard",method = RequestMethod.GET)
	public String searchBoard(String searchType,String searchText,Model model) {
	ArrayList<HashMap<String, Object>> list = service.searchBoard(searchType, searchText);
	model.addAttribute("list", list);
		
		return "board/boardList";
	}
	
	
	 
	 
	
	

}
