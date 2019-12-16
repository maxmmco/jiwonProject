package com.jiwon.web.board.service;



import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

import com.jiwon.common.Pagination;
import com.jiwon.common.Search;
import com.jiwon.web.board.model.BoardVO;

@Service
public interface BoardService {


	public List<BoardVO> getBoardList(Search search) throws Exception;

	public int getBoardListCnt(Search search) throws Exception;
    
    public void insertBoard(BoardVO boardVO) throws Exception;
    
    public BoardVO getBoardContent(int bid) throws Exception;

	public void updateBoard(BoardVO boardVO) throws Exception;
	
	public void deleteBoard(int bid) throws Exception;




}