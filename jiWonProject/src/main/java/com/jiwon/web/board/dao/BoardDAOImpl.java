package com.jiwon.web.board.dao;


import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.jiwon.common.Pagination;
import com.jiwon.common.Search;
import com.jiwon.web.board.model.BoardVO;
import com.jiwon.web.board.model.ReplyVO;


@Repository
public class BoardDAOImpl implements BoardDAO {

    @Inject

    private SqlSession sqlSession;



    @Override

  	public List<BoardVO> getBoardList(Search search) throws Exception {

  		return sqlSession.selectList("com.jiwon.web.board.boardMapper.getBoardList", search);

  	} 



  	@Override

  	public int getBoardListCnt(Search search) throws Exception {

  		return sqlSession.selectOne("com.jiwon.web.board.boardMapper.getBoardListCnt", search);

  	}




    @Override

    public BoardVO getBoardContent(int bid) throws Exception {

        return sqlSession.selectOne("com.jiwon.web.board.boardMapper.getBoardContent", bid);
    }



    @Override

    public int insertBoard(BoardVO boardVO) throws Exception {

        return sqlSession.insert("com.jiwon.web.board.boardMapper.insertBoard", boardVO);

    }



    @Override

    public int updateBoard(BoardVO boardVO) throws Exception {

        return sqlSession.update("com.jiwon.web.board.boardMapper.updateBoard", boardVO);

    }



    @Override

    public int deleteBoard(int bid) throws Exception {

        return sqlSession.insert("com.jiwon.web.board.boardMapper.deleteBoard", bid);

    }



    @Override

    public int updateViewCnt(int bid) throws Exception {

        return sqlSession.update("com.jiwon.web.board.boardMapper.updateViewCnt", bid);

    }
 // ��� ����Ʈ

 	@Override

 	public List<ReplyVO> getReplyList(int bid) throws Exception {

 		return sqlSession.selectList("com.jiwon.web.board.replyMapper.getReplyList", bid);

 	}



 	@Override

 	public int saveReply(ReplyVO replyVO) throws Exception {

 		return sqlSession.insert("com.jiwon.web.board.replyMapper.saveReply", replyVO);

 	}



 	@Override

 	public int updateReply(ReplyVO replyVO) throws Exception {

 		return sqlSession.update("com.jiwon.web.board.replyMapper.updateReply", replyVO);

 	}



 	@Override

 	public int deleteReply(int rid) throws Exception {

 		return sqlSession.delete("com.jiwon.web.board.replyMapper.deleteReply", rid);

 	}


}