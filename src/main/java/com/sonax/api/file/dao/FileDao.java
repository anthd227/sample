package com.sonax.api.file.dao;

import java.util.List;

import com.sonax.api.file.model.FileModel;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("fileDao")
public interface FileDao {
	public List<FileModel> getFileList() throws Exception;
	public FileModel getFileById(FileModel fileModel) throws Exception;
	public int insertFile(FileModel fileModel) throws Exception;
	public int updateFileById(FileModel fileModel) throws Exception;
	public int updateFileDelYn(FileModel fileModel) throws Exception;
	public int deleteFileById(FileModel fileModel) throws Exception;
	
}
