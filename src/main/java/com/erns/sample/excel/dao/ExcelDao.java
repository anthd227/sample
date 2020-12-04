package com.erns.sample.excel.dao;

import com.erns.sample.excel.model.FileModel;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("excelDao")
public interface ExcelDao {
	
	public int insertExcelFile(FileModel fileModel) throws Exception;	
}
