package com.springbook.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVo;
import com.springbook.biz.common.Log4jAdvice;


@Service("boardService")
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDAOSpring boardDAO;
	

	public void insertBoard(BoardVo vo) {
		//if(vo.getSeq() == 0) {
		//	throw new IllegalArgumentException("0번 글은 등록할 수 없습니다.");
		//}
		boardDAO.insertBoard(vo);
		
	}


	public void updateBoard(BoardVo vo) {
		boardDAO.updateBoard(vo);
		
	}

	
	public void deleteBoard(BoardVo vo) {
		boardDAO.deleteBoard(vo);
		
	}

	
	public BoardVo getBoard(BoardVo vo) {
		return boardDAO.getBoard(vo);
	}

	
	public List<BoardVo> getBoardList(BoardVo vo) {
		return boardDAO.getBoardList(vo);
	}

}
