package com.jiwon.web.board.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;



import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.ResponseBody;




import com.jiwon.web.board.model.ReplyVO;

import com.jiwon.web.board.service.BoardService;


@RequestMapping(value = "/restBoard")
public class RestBoardController {



	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);



	@Inject

	private BoardService boardService;

	
	@ResponseBody
	@RequestMapping(value = "/getReplyList", method = RequestMethod.POST)
	public List<ReplyVO> getReplyList(@RequestParam("bid") int bid) throws Exception {

		return boardService.getReplyList(bid);

	}
	@ResponseBody 
	@RequestMapping(value = "/saveReply", method = RequestMethod.POST)
	public Map<String, Object> saveReply(ReplyVO replyVO) throws Exception {

		Map<String, Object> result = new HashMap<>();

		

		try {

			boardService.saveReply(replyVO);

			result.put("status", "OK");

		} catch (Exception e) {

			e.printStackTrace();

			result.put("status", "False");

		}

		

		return result;

	}




}

