/**
 * 
 */
package com.simplecoding.simpleservice.board.service;


import com.simplecoding.simpleservice.board.vo.BoardVO;
import com.simplecoding.simpleservice.common.Criteria;
import com.simplecoding.simpleservice.testdata.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author simple-coding
 *
 */
@Service
public class BoardService {

	@Autowired
	private BoardMapper boardMapper;
	
	public List<?> selectBoardList(Criteria criteria) {
		return boardMapper.selectBoardList(criteria);
	}
	
	public void insert(BoardVO boardVO) {
		boardMapper.insert(boardVO);
	}
	
	public BoardVO selectBoard(long id) {
		return boardMapper.selectBoard(id);
	}
	
	public void update(BoardVO boardVO) {
		boardMapper.update(boardVO);	
	}
	
	public void delete(long id) {
		boardMapper.delete(id);
	}
}
