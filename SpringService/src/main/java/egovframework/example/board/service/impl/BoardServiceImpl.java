/**
 * 
 */
package egovframework.example.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.example.board.service.BoardService;
import egovframework.example.board.service.BoardVO;
import egovframework.example.common.Criteria;
import egovframework.example.testdata.mapper.BoardMapper;

/**
 * @author simple-coding
 *
 */
@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardMapper boardMapper;
	
	@Override
	public List<?> selectBoardList(Criteria criteria) {
		return boardMapper.selectBoardList(criteria);
	}
	
	@Override
	public void insert(BoardVO boardVO) {
		boardMapper.insert(boardVO);
	}
	
	@Override
	public BoardVO selectBoard(long id) {
		return boardMapper.selectBoard(id);
	}
	
	@Override
	public void update(BoardVO boardVO) {
		boardMapper.update(boardVO);	
	}
	
	@Override
	public void delete(long id) {
		boardMapper.delete(id);
	}
}
