package com.sonax.api.file.model;

import java.sql.Date;

import com.sonax.common.model.VersionBaseModel;

public class FileModel extends VersionBaseModel {

	private int fileId;
	private String refCode; // 대상 테이블(메뉴)명 
	private int refId; // 대상 글 번호
	private int fileOrder;
	private String fileNameDest;
	private String fileName;
	private int fileSize;
	private String fileExtension;
	private String filePath;
	private String delYn;
	
	public FileModel() {
		super();
	}
	public int getFileId() {
		return fileId;
	}
	public void setFileId(int fileId) {
		this.fileId = fileId;
	}
	public String getRefCode() {
		return refCode;
	}
	public void setRefCode(String refCode) {
		this.refCode = refCode;
	}
	public int getRefId() {
		return refId;
	}
	public void setRefId(int refId) {
		this.refId = refId;
	}
	public int getFileOrder() {
		return fileOrder;
	}
	public void setFileOrder(int fileOrder) {
		this.fileOrder = fileOrder;
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
	public String getDelYn() {
		return delYn;
	}
	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}
	
}
