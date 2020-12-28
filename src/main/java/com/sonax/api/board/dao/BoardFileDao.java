package com.sonax.api.board.dao;

import java.util.List;

import com.sonax.api.board.model.BoardFileModel;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("boardDao")
public interface BoardFileDao {
	public List<BoardFileModel> getBoardFileList() throws Exception;
	public BoardFileModel getBoardFileById(BoardFileModel boardFileModel) throws Exception;
	public int insertBoardFile(BoardFileModel boardFileModel) throws Exception;
	public int updateBoardFile(BoardFileModel boardFileModel) throws Exception;
	public int deleteBoardFileById(BoardFileModel boardFileModel) throws Exception;

}
