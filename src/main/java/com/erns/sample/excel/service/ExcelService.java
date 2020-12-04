package com.erns.sample.excel.service;

import com.erns.sample.excel.model.FileModel;

public interface ExcelService {
	public int insertExcelFile(FileModel fileModel) throws Exception;
}
