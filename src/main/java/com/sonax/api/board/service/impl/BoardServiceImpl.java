package com.sonax.api.board.service.impl;

import java.util.List;

import com.sonax.api.board.model.BoardCommentModel;
import com.sonax.api.board.model.BoardFileModel;
import com.sonax.api.board.model.BoardMasterModel;
import com.sonax.api.board.model.BoardModel;
import com.sonax.api.board.service.BoardService;

public class BoardServiceImpl implements BoardService {

	// BoardMaster
	@Override
	public List<BoardMasterModel> getBoardMasterList() throws Exception {
		
		return null;
	}

	@Override
	public BoardMasterModel getBoardMasterById(BoardMasterModel boardMasterModel) throws Exception {
		
		return null;
	}

	@Override
	public int insertBoardMaster(BoardMasterModel boardMasterModel) throws Exception {
		
		return 0;
	}

	@Override
	public int updateBoardMaster(BoardMasterModel boardMasterModel) throws Exception {
		
		return 0;
	}

	@Override
	public int deleteBoardMasterById(BoardMasterModel boardMasterModel) throws Exception {
		
		return 0;
	}
	
	// Board
	@Override
	public List<BoardModel> getBoardList() throws Exception {
		
		return null;
	}

	@Override
	public BoardModel getBoardById(BoardModel boardModel) throws Exception {
		
		return null;
	}

	@Override
	public int insertBoard(BoardModel boardModel) throws Exception {
		
		return 0;
	}

	@Override
	public int updateBoard(BoardModel boardModel) throws Exception {
		
		return 0;
	}

	@Override
	public int deleteBoardById(BoardModel boardModel) throws Exception {
		
		return 0;
	}

	// BoardComment
	@Override
	public List<BoardCommentModel> getCommentList() throws Exception {
		
		return null;
	}

	@Override
	public List<BoardCommentModel> getCommentByBoardId(BoardCommentModel commentModel) throws Exception {
		
		return null;
	}

	@Override
	public BoardCommentModel getCommentByCmtId(BoardCommentModel commentModel) throws Exception {
		
		return null;
	}

	@Override
	public int insertComment(BoardCommentModel commentModel) throws Exception {
		
		return 0;
	}

	@Override
	public int updateComment(BoardCommentModel commentModel) throws Exception {
		
		return 0;
	}
	
	@Override
	public int deleteCommentByBoardId(BoardCommentModel commentModel) throws Exception {
		
		return 0;
	}

	@Override
	public int deleteCommentByCommentId(BoardCommentModel commentModel) throws Exception {
		
		return 0;
	}
	
	// BoardFile
	@Override
	public List<BoardFileModel> getBoardFileList() throws Exception {
		
		return null;
	}

	@Override
	public BoardFileModel getBoardFileById(BoardFileModel boardFileModel) throws Exception {
		
		return null;
	}

	@Override
	public int insertBoardFile(BoardFileModel boardFileModel) throws Exception {
		
		return 0;
	}

	@Override
	public int updateBoardFile(BoardFileModel boardFileModel) throws Exception {
		
		return 0;
	}

	@Override
	public int deleteBoardFileById(BoardFileModel boardFileModel) throws Exception {
		
		return 0;
	}

}
