package com.erns.sample.excel.model;

import java.sql.Date;

public class FileModel {

	private int fileId;
	private String objCode;
	private int objId;
	private int fileOrder;
	private String fileNameDest;
	private String fileName;
	private long fileSize;
	private String fileExtension;
	private String filePath;
	private String delYn;
	private String regId;
	private Date regDate;
	private String udtId;
	private Date udtDate;
	public int getFileId() {
		return fileId;
	}
	public void setFileId(int fileId) {
		this.fileId = fileId;
	}
	public String getObjCode() {
		return objCode;
	}
	public void setObjCode(String objCode) {
		this.objCode = objCode;
	}
	public int getObjId() {
		return objId;
	}
	public void setObjId(int objId) {
		this.objId = objId;
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
	public long getFileSize() {
		return fileSize;
	}
	public void setFileSize(long fileSize) {
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
