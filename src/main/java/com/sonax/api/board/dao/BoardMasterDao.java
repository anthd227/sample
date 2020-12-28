package com.sonax.api.board.dao;

import java.util.List;

import com.sonax.api.board.model.BoardMasterModel;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("boardDao")
public interface BoardMasterDao {
	public List<BoardMasterModel> getBoardMasterList() throws Exception;
	public BoardMasterModel getBoardMasterById(BoardMasterModel boardMasterModel) throws Exception;
	public int insertBoardMaster(BoardMasterModel boardMasterModel) throws Exception;
	public int updateBoardMaster(BoardMasterModel boardMasterModel) throws Exception;
	public int deleteBoardMasterById(BoardMasterModel boardMasterModel) throws Exception;
	

}
