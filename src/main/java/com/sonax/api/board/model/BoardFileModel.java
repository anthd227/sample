package com.sonax.api.board.model;

import java.sql.Date;

public class BoardFileModel {
	private int boardFileId; 
	private int postId;       
	private String fileNameDest;
	private String fileName;     
	private int fileSize;     
	private String fileExtension;
	private String filePath;     
	private int fileOrder;    
	private String delYn;        
	private String regId;        
	private Date regDate;      
	private String udtId;        
	private Date udtDate;
	
	public BoardFileModel() {
		super();
	}

	public int getBoardFileId() {
		return boardFileId;
	}

	public void setBoardFileId(int boardFileId) {
		this.boardFileId = boardFileId;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
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
