package com.erns.sample.excel.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.erns.sample.excel.dao.ExcelDao;
import com.erns.sample.excel.model.FileModel;
import com.erns.sample.excel.service.ExcelService;

@Service("excelService")
public class ExcelServiceImpl implements ExcelService{

	@Resource(name="excelDao")
	private ExcelDao excelDao;
	
	@Override
	public int insertExcelFile(FileModel fileModel) throws Exception {
		int result = excelDao.insertExcelFile(fileModel);
		return result;
	}

}
