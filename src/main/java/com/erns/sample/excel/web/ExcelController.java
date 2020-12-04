package com.erns.sample.excel.web;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.commons.io.FilenameUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.erns.sample.excel.model.FileModel;
import com.erns.sample.excel.service.ExcelService;

@Controller
@RequestMapping("excel")
public class ExcelController {
	
	@Resource(name="excelService")
	private ExcelService excelService;

	@RequestMapping("/excelPage.do")
	public String excelPage() {
		return "excel/excel";
	}

	@RequestMapping("/fileUpload.do")
	public String fileUpload(MultipartHttpServletRequest request) {
		/*
		 * String path =
		 * "C:\\jdk17\\workspace\\sample\\src\\main\\webapp\\excel\\upload";
		 */
		String path = "C:\\test\\excel\\upload";
		String fileName = "";
		String fileNameDest = "";
		String ext = "";

		FileModel fModel = new FileModel();
		
		FileOutputStream os = null;
		PrintWriter pw = null;

		try {
			MultipartFile uploadFile = request.getFile("uploadFile");
			fileName = uploadFile.getOriginalFilename();
		
			byte[] bytes = uploadFile.getBytes();

			File file = new File(path);
			
			if (!file.exists()) {
				file.mkdir();
			}

			if (fileName != null && !fileName.equals("")) {
				ext = FilenameUtils.getExtension(fileName);
				
				fileNameDest = UUID.randomUUID().toString() + "." + ext;
				fileName = uploadFile.getOriginalFilename();
				
				fModel.setFileName(fileName);
				fModel.setFileNameDest(fileNameDest);
				fModel.setFileExtension(ext);
				fModel.setFilePath(path);
				fModel.setFileSize(uploadFile.getSize());
				file = new File(path + File.separator + fileNameDest);
				
			}
		
			os = new FileOutputStream(file);
			os.write(bytes);
			
			excelService.insertExcelFile(fModel);
			/*if (ext.equals("xls") || ext.equals("xlsx")) {
				saveExcel(path + File.separator + fileName, fileName, ext);
			}*/

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (os != null) {
					os.close();
				}
				if (pw != null) {
					pw.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}

		}
		return "excel/excel";
	}

	public void saveExcel(String destPath, String fileName, String ext) {
		try {
			FileInputStream fis = new FileInputStream(destPath);
			// POIFSFileSystem fileSystem = new POIFSFileSystem(fis);
			/*
			 * String[] extention = fileName.split("."); String ext =
			 * extention[extention.length - 1]; Workbook workbook = new HSSFWorkbook(fis);
			 */
			Workbook workbook = null;
			if (ext.equals("xls")) {
				workbook = new HSSFWorkbook(fis);
			} else {
				workbook = new XSSFWorkbook(fis);
			}
			Workbook newExcel = new XSSFWorkbook();

			int sheetCnt = workbook.getNumberOfSheets();
			for (int k = 0; k < sheetCnt; k++) {
				Sheet sheet = workbook.getSheetAt(k);
				int rows = sheet.getPhysicalNumberOfRows();
				Sheet newSheet = newExcel.createSheet(sheet.getSheetName());
				if (sheet.getMergedRegion(k) != null) {
					newSheet.addMergedRegion(sheet.getMergedRegion(k));
				}
				CellStyle newStyle = newExcel.createCellStyle();

				for (int i = 0; i <= rows; i++) {
					Row row = sheet.getRow(i);
					Row newRow = newSheet.createRow(i);
					if (row != null) {
						newRow.setHeight(row.getHeight());
						int cells = row.getPhysicalNumberOfCells();
						for (int j = 0; j <= cells; j++) {
							String value = "";
							Cell cell = row.getCell(j);
							Cell newCell = newRow.createCell(j);

							if (cell != null) {

								CellStyle style = cell.getCellStyle();

								newSheet.setColumnWidth(j, sheet.getColumnWidth(j));
								newStyle.setWrapText(style.getWrapText());
								newCell.setCellStyle(newStyle);
								switch (cell.getCellType()) {
								case FORMULA:
									value = cell.getCellFormula();
									newCell.setCellValue(cell.getCellFormula());
									break;
								case NUMERIC:
									value = String.valueOf(cell.getNumericCellValue());
									newCell.setCellValue(cell.getNumericCellValue());
									break;
								case STRING:
									value = cell.getStringCellValue();
									newCell.setCellValue(cell.getStringCellValue());
									break;
								case BLANK:
									value = "-";
									newCell.setCellValue("");
									break;
								case ERROR:
									value = "error";
									newCell.setCellValue("");
									break;
								}
								// System.out.println(value);
							}

						}

					}
				}
			}
			// newStyle.cloneStyleFrom(style);
			File file = new File("C:\\test\\excel2\\newFile");
			if (!file.exists()) {
				file.mkdir();
			}
			FileOutputStream fos = new FileOutputStream("C:\\test\\excel2\\newFile\\" + fileName);
			newExcel.write(fos);

			fos.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void saveNewExcel(String destPath, String fileName, String ext) {
		try {
			FileInputStream fis = new FileInputStream(destPath);
			FileInputStream fis2 = new FileInputStream("C:\\test\\excel\\excel_template2.xlsx");
			// POIFSFileSystem fileSystem = new POIFSFileSystem(fis);
			/*
			 * String[] extention = fileName.split("."); String ext =
			 * extention[extention.length - 1]; Workbook workbook = new HSSFWorkbook(fis);
			 */
			Workbook workbook = null;
			if (ext.equals("xls")) {
				workbook = new HSSFWorkbook(fis);
			} else {
				workbook = new XSSFWorkbook(fis);
			}

			Workbook newExcel = new XSSFWorkbook(fis2);

			int sheetCnt = workbook.getNumberOfSheets();

			Sheet sheet = workbook.getSheetAt(0);
			int rows = sheet.getPhysicalNumberOfRows();
			Sheet newSheet = newExcel.getSheetAt(0);
			CellStyle style = newExcel.createCellStyle();
			for (int i = 5; i <= rows; i++) {
				Row row = sheet.getRow(i);

				if (row != null) {
					int cells = row.getPhysicalNumberOfCells();
					if (i > 0) {
						for (int j = 0; j <= cells; j++) {
							Cell cell = row.getCell(j);

							if (cell != null) {

								if (i == 7) {
									if (j == 6) {
										newSheet.getRow(3).getCell(2).setCellValue(cell.getStringCellValue());
									}
									if (j == 7) {
										newSheet.getRow(1).getCell(2).setCellValue(cell.getStringCellValue());
									}
									if (j == 9) {
										newSheet.getRow(19).getCell(2).setCellValue(cell.getStringCellValue());
										style.setWrapText(true); 
										newSheet.getRow(19).getCell(2).setCellStyle(style);
									}
								}

							}

						}
					}

				}
			}
			File file = new File("C:\\test\\excel2\\newFile");
			if (!file.exists()) {
				file.mkdir();
			}
			Calendar date = Calendar.getInstance();

			FileOutputStream fos = new FileOutputStream("C:\\test\\excel2\\newFile\\" + fileName);
			newExcel.write(fos);

			fos.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String saveCopyExcel(String destPath, String fileName, String ext) {
		try {
			FileInputStream fis = new FileInputStream(destPath);
			Workbook workbook = null;

			if (ext.equals("xls")) {
				workbook = new HSSFWorkbook(fis);
			} else if (ext.equals("xlsx")) {
				workbook = new XSSFWorkbook(fis);
			} else {
				return "NOT_EXCEL_FILE";
			}
			
			
			int sheetCnt = workbook.getNumberOfSheets();
			for(int i = 0; i < sheetCnt; i++) {
				
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		return "";
	}
	
	public String getCurrentTime() {
		Calendar date = Calendar.getInstance();
		
		String year = Integer.toString(date.get(Calendar.YEAR)); 
		String month = Integer.toString(date.get(Calendar.MONTH) + 1); 
		String day = Integer.toString(date.get(Calendar.DATE)); 
		return "";
	}
}
