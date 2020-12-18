package com.sonax.api.file.service;

import java.util.List;

import com.sonax.api.file.model.FileModel;

public interface FileService {
	public List<FileModel> getFileList() throws Exception;
	public FileModel getFileById(FileModel fileModel) throws Exception;
	public int insertFile(FileModel fileModel) throws Exception;
	public int updateFileById(FileModel fileModel) throws Exception;
	public int updateFileDelYn(FileModel fileModel) throws Exception;
	public int deleteFileById(FileModel fileModel) throws Exception;
}
