package com.sonax.api.board.model;

import com.sonax.common.model.VersionBaseModel;

public class BoardFileModel extends VersionBaseModel {
	private int boardFileId; 
	private int boardId;       
	private String fileNameDest;
	private String fileName;     
	private int fileSize;     
	private String fileExtension;
	private String filePath;     
	private int fileOrder;    
	private String delYn;        
	
	public BoardFileModel() {
		super();
	}

	public int getBoardFileId() {
		return boardFileId;
	}

	public void setBoardFileId(int boardFileId) {
		this.boardFileId = boardFileId;
	}

	public int getBoardId() {
		return boardId;
	}

	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}

	public String getFileNameDest() {
		return fileNameDest;
	}

	public void setFileNameDest(String fileNameDest) {
		this.fileNameDest = fileNameDest;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public int getFileSize() {
		return fileSize;
	}

	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}

	public String getFileExtension() {
		return fileExtension;
	}

	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public int getFileOrder() {
		return fileOrder;
	}

	public void setFileOrder(int fileOrder) {
		this.fileOrder = fileOrder;
	}

	public String getDelYn() {
		return delYn;
	}

	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}

}
