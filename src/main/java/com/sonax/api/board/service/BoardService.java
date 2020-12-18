package com.sonax.api.board.service;

import java.util.List;

import com.sonax.api.board.model.BoardFileModel;
import com.sonax.api.board.model.BoardMasterModel;
import com.sonax.api.board.model.BoardModel;
import com.sonax.api.board.model.CommentModel;

public interface BoardService {
	// BOARD MASTER
	public List<BoardMasterModel> getBoardMasterList() throws Exception;
	public BoardMasterModel getBoardMasterById(BoardMasterModel boardMasterModel) throws Exception;
	public int insertBoardMaster(BoardMasterModel boardMasterModel) throws Exception;
	public int updateBoardMaster(BoardMasterModel boardMasterModel) throws Exception;
	public int deleteBoardMasterById(BoardMasterModel boardMasterModel) throws Exception;
	
	// BOARD 
	public List<BoardModel> getBoardList() throws Exception;
	public BoardModel getBoardById(BoardModel boardModel) throws Exception;
	public int insertBoard(BoardModel boardModel) throws Exception;
	public int updateBoard(BoardModel boardModel) throws Exception;
	public int deleteBoardById(BoardModel boardModel) throws Exception;

	// BOARD COMMENT
	public List<CommentModel> getCommentList() throws Exception;
	public CommentModel getCommentById(CommentModel commentModel) throws Exception;
	public int insertComment(CommentModel commentModel) throws Exception;
	public int updateComment(CommentModel commentModel) throws Exception;
	public int deleteCommentById(CommentModel commentModel) throws Exception;

	// BOARD FILE
	public List<BoardFileModel> getBoardFileList() throws Exception;
	public BoardFileModel getBoardFileById(BoardFileModel boardFileModel) throws Exception;
	public int insertBoardFile(BoardFileModel boardFileModel) throws Exception;
	public int updateBoardFile(BoardFileModel boardFileModel) throws Exception;
	public int deleteBoardFileById(BoardFileModel boardFileModel) throws Exception;
}
