package com.jiwon.web.board.dao;

import java.util.List;

import com.jiwon.common.Pagination;
import com.jiwon.common.Search;
import com.jiwon.web.board.model.BoardVO;
import com.jiwon.web.board.model.ReplyVO;

public interface BoardDAO {

	public List<BoardVO> getBoardList(Search search) throws Exception;

	public int getBoardListCnt(Search search) throws Exception;

	public BoardVO getBoardContent(int bid) throws Exception;

	public int insertBoard(BoardVO boardVO) throws Exception;

	public int updateBoard(BoardVO boardVO) throws Exception;

	public int deleteBoard(int bid) throws Exception;

	public int updateViewCnt(int bid) throws Exception;

	// ��� ����Ʈ

	public List<ReplyVO> getReplyList(int bid) throws Exception;

	public int saveReply(ReplyVO replyVO) throws Exception;

	public int updateReply(ReplyVO replyVO) throws Exception;

	public int deleteReply(int rid) throws Exception;

}