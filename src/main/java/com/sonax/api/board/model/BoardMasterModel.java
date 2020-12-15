package com.sonax.api.board.model;

import java.sql.Date;

public class BoardMasterModel {
	private int boardId;
	private String boardName;
	private String boardType;
	private String boardDesc;
	private String fileAddYn; // 파일첨부 가능여부
	private int fileCnt; // 첨부가능한 파일 개수
	private String fileExtension; // 첨부가능한 파일 종류
	private String useYn;
	private String regId;
	private Date regDate;
	private String udtId;
	private Date udtDate;
	
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

	public String getRegId() {
		return regId;
	}

	public void setRegId(String regId) {
		this.regId = regId;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getUdtId() {
		return udtId;
	}

	public void setUdtId(String udtId) {
		this.udtId = udtId;
	}

	public Date getUdtDate() {
		return udtDate;
	}

	public void setUdtDate(Date udtDate) {
		this.udtDate = udtDate;
	}
	
}
