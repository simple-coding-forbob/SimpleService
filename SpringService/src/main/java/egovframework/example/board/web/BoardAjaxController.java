/**
 * 
 */
package egovframework.example.board.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import egovframework.example.common.Criteria;
import egovframework.example.board.service.BoardService;
import egovframework.example.board.service.BoardVO;
import jdk.internal.org.jline.utils.Log;
import lombok.extern.log4j.Log4j;

/**
 * @author simple-coding
 * AutoComplete
 */
@Log4j
@RestController
public class BoardAjaxController {
	@Autowired
	private BoardService boardService;

	@GetMapping("/api/board/board.do")
	public List<?> selectBoardList(@ModelAttribute("searchVO") Criteria criteria) {
		log.info(criteria);
		List<?> list = boardService.selectBoardList(criteria);
		
		return list;
	}
}
