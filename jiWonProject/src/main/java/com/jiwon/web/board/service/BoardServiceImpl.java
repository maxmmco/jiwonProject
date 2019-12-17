package com.jiwon.web.board.service;


import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.jiwon.common.Pagination;
import com.jiwon.common.Search;
import com.jiwon.web.board.dao.BoardDAO;
import com.jiwon.web.board.model.BoardVO;
import com.jiwon.web.board.model.ReplyVO;


@Repository
public class BoardServiceImpl implements BoardService {



    @Inject
    private BoardDAO boardDAO;
    
	@Override
	public List<BoardVO> getBoardList(Search search) throws Exception {
		return boardDAO.getBoardList(search);
	}

	@Override

	public int getBoardListCnt(Search search) throws Exception {

		return boardDAO.getBoardListCnt(search);

	}

	@Override
	public void insertBoard(BoardVO boardVO) throws Exception {

		boardDAO.insertBoard(boardVO);

	}
	
	@Override
	public void updateBoard(BoardVO boardVO) throws Exception {

		boardDAO.updateBoard(boardVO);

	}
	
	public BoardVO getBoardContent(int bid) throws Exception{

		boardDAO.updateViewCnt(bid);

		return boardDAO.getBoardContent(bid);

	}
	@Override

	public void deleteBoard(int bid) throws Exception {

		 boardDAO.deleteBoard(bid);

	}
	// ´ñ±Û ¸®½ºÆ®

	@Override

	public List<ReplyVO> getReplyList(int bid) throws Exception {

		return boardDAO.getReplyList(bid);

	}



	@Override

	public int saveReply(ReplyVO replyVO) throws Exception {

		return boardDAO.saveReply(replyVO);

	}



	@Override

	public int updateReply(ReplyVO replyVO) throws Exception {

		return boardDAO.updateReply(replyVO);

	}



	@Override

	public int deleteReply(int rid) throws Exception {

		return boardDAO.deleteReply(rid);

	}



}