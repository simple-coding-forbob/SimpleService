/**
 * 
 */
package com.simplecoding.simpleservice.board.controller;

import com.simplecoding.simpleservice.board.service.BoardService;
import com.simplecoding.simpleservice.common.Criteria;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author simple-coding
 * AutoComplete
 */
@Log4j2
@RestController
public class BoardAjaxController {
	@Autowired
	private BoardService boardService;

	@GetMapping("/api/board")
	public List<?> selectBoardList(@ModelAttribute("searchVO") Criteria criteria) {
		log.info(criteria);
		List<?> list = boardService.selectBoardList(criteria);
		
		return list;
	}
}
