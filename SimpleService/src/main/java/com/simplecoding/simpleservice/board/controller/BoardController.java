package com.simplecoding.simpleservice.board.controller;


import com.simplecoding.simpleservice.board.service.BoardService;
import com.simplecoding.simpleservice.board.vo.BoardVO;
import com.simplecoding.simpleservice.common.Criteria;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Log4j2
@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;

	@GetMapping("/board")
	public String selectBoardList(@ModelAttribute Criteria criteria, Model model) {
		List<?> list = boardService.selectBoardList(criteria);
		model.addAttribute("list", list);

		return "board/board_all";
	}

//	부서 추가 페이지 열기 
	@GetMapping("/board/addition")
	public String addBoardView() {
		return "board/add_board";
	}

	@PostMapping("/board/add")
	public String insert(@ModelAttribute BoardVO boardVO) {
		
		boardService.insert(boardVO);
		return "redirect:/board";
	}

//	부서 수정 페이지 열기 (상세 조회)
	@GetMapping("/board/edition")
	public String updateBoardView(Model model,
					@RequestParam(defaultValue = "0") long id
								) {
		BoardVO boardVO = boardService.selectBoard(id);
		model.addAttribute("boardVO", boardVO);

		return "board/update_board";
	}

	@PostMapping("/board/edit")
	public String update(@RequestParam(defaultValue = "0") long id, 
			                 @ModelAttribute BoardVO boardVO) {
		boardService.update(boardVO);
		return "redirect:/board";
	}
	
	@PostMapping("/board/delete")
	public String delete(@RequestParam(defaultValue = "0") long id) {
		boardService.delete(id);
		return "redirect:/board";
	}
}












