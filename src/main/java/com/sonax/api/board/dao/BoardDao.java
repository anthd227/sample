package com.sonax.api.board.dao;

import java.util.List;

import com.sonax.api.board.model.BoardModel;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("boardDao")
public interface BoardDao {
	public List<BoardModel> getBoardList() throws Exception;
	public BoardModel getBoardById(BoardModel boardModel) throws Exception;
	public int insertBoard(BoardModel boardModel) throws Exception;
	public int updateBoard(BoardModel boardModel) throws Exception;
	public int deleteBoardById(BoardModel boardModel) throws Exception;


}
