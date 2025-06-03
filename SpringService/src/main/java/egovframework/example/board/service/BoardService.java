/**
 * 
 */
package egovframework.example.board.service;

import java.util.List;

import egovframework.example.common.Criteria;

/**
 * @author simple-coding
 *
 */
public interface BoardService {
	List<?> selectBoardList(Criteria criteria);
	void insert(BoardVO boardVO);
	BoardVO selectBoard(long id);
	void update(BoardVO boardVO);
	void delete(long id);
}


