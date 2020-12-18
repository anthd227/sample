package com.sonax.api.file.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sonax.api.file.model.FileModel;
import com.sonax.api.file.service.FileService;

@Service("fileService")
public class FileServiceImpl implements FileService {

	@Override
	public List<FileModel> getFileList() throws Exception {
		
		return null;
	}

	@Override
	public FileModel getFileById(FileModel fileModel) throws Exception {

		return null;
	}

	@Override
	public int insertFile(FileModel fileModel) throws Exception {
		
		return 0;
	}

	@Override
	public int updateFileById(FileModel fileModel) throws Exception {
		
		return 0;
	}

	@Override
	public int updateFileDelYn(FileModel fileModel) throws Exception {

		return 0;
	}

	@Override
	public int deleteFileById(FileModel fileModel) throws Exception {

		return 0;
	}
	
}
