package com.bdd.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	
	public class ExcelUtility {
		
		

		
			/*
			 * public ArrayList<String> getData(String testCase) throws IOException {
			 * ArrayList<String> testCaseData = new ArrayList<>(); //CREATE FILE OBJECT
			 * WHICH WILL READ DATA FROM FILE. FileInputStream fis = new
			 * FileInputStream("F://ExcelDataRetrieve.xlsx");
			 * 
			 * //GIVE ACCESS XSSFWORKBOOK OBJECT TO RETRIEVE DATA XSSFWorkbook excel = new
			 * XSSFWorkbook(fis);
			 * 
			 * int sheets = excel.getNumberOfSheets();
			 * 
			 * for(int i=0; i<sheets; i++) {
			 * if(excel.getSheetAt(i).getSheetName().equalsIgnoreCase("Sheet1")) { // GOT
			 * ENTIRE SINGLE SHEET OUT OF SHEETS. XSSFSheet sheet = excel.getSheetAt(i);
			 * 
			 * //***IDENTIFY TESTCASE COLUMN BY SCNING 1ST ROW.
			 * 
			 * //AS SHEET CONSISTS OF ROWS AND ROW CONSISTS OF COLUMN. //HERE FIRST OF ALL
			 * SCAN ALL ROWS AND GET SPECIFIED ROW Iterator<Row> rows = sheet.iterator();
			 * 
			 * //got first row Row firstRow = rows.next();
			 * 
			 * // CREATED ITERATOR TO SCAN EACH CELL OF ROW Iterator<Cell> cells =
			 * firstRow.cellIterator();
			 * 
			 * int columnIndex=0; //TO GET TESTCASES COLUMN BY SCANNING ROW.
			 * while(cells.hasNext()) { Cell cell = cells.next();
			 * if(cell.getStringCellValue().equalsIgnoreCase("TestCases")) break;
			 * 
			 * columnIndex++; }
			 * 
			 * System.out.println("column no: "+columnIndex);
			 * 
			 * //ONCE WE GOT TESTCASES COLUMN NOW WE NEED TO SCAN THAT COLUMN TO IDENTIFY
			 * PURCHASE.
			 * 
			 * while(rows.hasNext()) { Row r = rows.next(); Cell c1 =
			 * r.getCell(columnIndex); if(c1!=null &&
			 * c1.getStringCellValue().equalsIgnoreCase(testCase)) { Iterator<Cell> cv =
			 * r.cellIterator(); while(cv.hasNext()) { Cell c2 = cv.next();
			 * if(c2.getCellTypeEnum()== CellType.STRING) {
			 * testCaseData.add(c2.getStringCellValue()); }else {
			 * testCaseData.add(NumberToTextConverter.toText(c2.getNumericCellValue())); }
			 * 
			 * } break; } }
			 * 
			 * } }
			 * 
			 * excel.close();
			 * 
			 * return testCaseData; }
			 */
			
				public ArrayList<String> getData(String testcaseName) throws IOException {

					
					ArrayList<String> a = new ArrayList<String>();
					
					FileInputStream fis = new FileInputStream(".\\TestData\\FrameworkData.xlsx");
					
					System.out.println("file found");
					XSSFWorkbook workbook = new XSSFWorkbook(fis);
					
					int sheets = workbook.getNumberOfSheets();
					
					for(int i=0; i<sheets; i++) {
						
						if(workbook.getSheetName(i).equalsIgnoreCase("sheet1")) {
							
						XSSFSheet sheet = workbook.getSheetAt(i);
						
						Iterator<Row> rows = sheet.iterator();
						
						Row firstrow =rows.next();
						
						Iterator<Cell> ce = firstrow.iterator();
						
						int column=0;
						while(ce.hasNext()) {
							
							Cell c1 = ce.next();
							
							if(c1.getStringCellValue().equalsIgnoreCase("Iphone 13 pro max")) {
							  break;
							}
						
							  column++;	
						}
						
						System.out.println("tets cases column pesent at this index :"+column);
						
						int c=0;
						
						while(rows.hasNext()){
							
							Row r = rows.next();
							
							Cell v =r.getCell(column);
							
							if(v!=null && v.getStringCellValue().equalsIgnoreCase(testcaseName)) {
								
								Iterator<Cell> cv = r.cellIterator();
								
								while(cv.hasNext() ) {
									Cell h = cv.next();
									
									System.out.println("column index :" + c);
									c++;
									
									  a.add(h.getStringCellValue());
								}
								
								break;
							}
						}
					}
						
				}	
					
					return a;
				}	
				
				}
	


