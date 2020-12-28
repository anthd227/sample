package com.sonax.api.board.model;

import com.sonax.common.model.VersionBaseModel;

public class BoardMasterModel extends VersionBaseModel {
	private int boardMstId;
	private String boardNm;
	private String boardType;
	private String boardDesc;
	private String noticeYn;
	private String fileAddYn; // 파일첨부 가능여부
	private int fileCnt; // 첨부가능한 파일 개수
	private String fileExtension; // 첨부가능한 파일 종류
	private String useYn;
	
	public BoardMasterModel() {
		super();
	}

	public int getBoardMstId() {
		return boardMstId;
	}

	public void setBoardMstId(int boardMstId) {
		this.boardMstId = boardMstId;
	}

	public String getBoardNm() {
		return boardNm;
	}

	public void setBoardNm(String boardNm) {
		this.boardNm = boardNm;
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

	public String getNoticeYn() {
		return noticeYn;
	}

	public void setNoticeYn(String noticeYn) {
		this.noticeYn = noticeYn;
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
