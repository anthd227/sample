package com.sonax.api.board.model;

import com.sonax.common.model.VersionBaseModel;

public class BoardMasterModel extends VersionBaseModel {
	private int boardId;
	private String boardName;
	private String boardType;
	private String boardDesc;
	private String fileAddYn; // 파일첨부 가능여부
	private int fileCnt; // 첨부가능한 파일 개수
	private String fileExtension; // 첨부가능한 파일 종류
	private String useYn;
	
	public BoardMasterModel() {
		super();
	}

	public int getBoardId() {
		return boardId;
	}

	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}

	public String getBoardName() {
		return boardName;
	}

	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}

	public String getBoardType() {
		return boardType;
	}

	public void setBoardType(String boardType) {
		this.boardType = boardType;
	}

	public String getBoardDesc() {
		return boardDesc;
	}

	public void setBoardDesc(String boardDesc) {
		this.boardDesc = boardDesc;
	}

	public String getFileAddYn() {
		return fileAddYn;
	}

	public void setFileAddYn(String fileAddYn) {
		this.fileAddYn = fileAddYn;
	}

	public int getFileCnt() {
		return fileCnt;
	}

	public void setFileCnt(int fileCnt) {
		this.fileCnt = fileCnt;
	}

	public String getFileExtension() {
		return fileExtension;
	}

	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
	}

	public String getUseYn() {
		return useYn;
	}

	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}

}
