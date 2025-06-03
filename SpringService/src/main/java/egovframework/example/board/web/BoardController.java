package egovframework.example.board.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import egovframework.example.common.Criteria;
import egovframework.example.board.service.BoardService;
import egovframework.example.board.service.BoardVO;
import lombok.extern.log4j.Log4j;

@Log4j
@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;

	@GetMapping("/board/board.do")
	public String selectBoardList(@ModelAttribute("searchVO") Criteria criteria, Model model) {
		List<?> list = boardService.selectBoardList(criteria);
		model.addAttribute("list", list);

		return "board/board_all";
	}

//	부서 추가 페이지 열기 
	@GetMapping("/board/addition.do")
	public String addBoardView() {
		return "board/add_board";
	}

	@PostMapping("/board/add.do")
	public String insert(@ModelAttribute BoardVO boardVO) {
		
		boardService.insert(boardVO);
		return "redirect:/board/board.do";
	}

//	부서 수정 페이지 열기 (상세 조회)
	@GetMapping("/board/edition.do")
	public String updateBoardView(Model model,
					@RequestParam(defaultValue = "0") long id
								) {
		BoardVO boardVO = boardService.selectBoard(id);
		model.addAttribute("boardVO", boardVO);

		return "board/update_board";
	}

	@PostMapping("/board/edit.do")
	public String update(@RequestParam(defaultValue = "0") long id, 
			                 @ModelAttribute BoardVO boardVO) {
		boardService.update(boardVO);
		return "redirect:/board/board.do";
	}
	
	@PostMapping("/board/delete.do")
	public String delete(@RequestParam(defaultValue = "0") long id) {
		boardService.delete(id);
		return "redirect:/board/board.do";
	}
}












