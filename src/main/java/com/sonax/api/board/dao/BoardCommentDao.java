package com.sonax.api.board.dao;

import java.util.List;

import com.sonax.api.board.model.BoardCommentModel;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("boardDao")
public interface BoardCommentDao {
	public List<BoardCommentModel> getCommentList() throws Exception;
	public List<BoardCommentModel> getCommentByBoardId(BoardCommentModel commentModel) throws Exception;
	public BoardCommentModel getCommentByCmtId(BoardCommentModel commentModel) throws Exception;
	public int insertComment(BoardCommentModel commentModel) throws Exception;
	public int updateComment(BoardCommentModel commentModel) throws Exception;
	public int deleteCommentByBoardId(BoardCommentModel commentModel) throws Exception;
	public int deleteCommentByCommentId(BoardCommentModel commentModel) throws Exception;

}
