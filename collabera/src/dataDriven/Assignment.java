
package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author DARSHANA
 *
 */
public class excelLib {
	String excelPath = "./testResorces/dmeo2.xlsx";
	/**
	 * this method is used to read the deta from excel file
	 * @param sheetname provide the sheetname where you test the deta
	 * @param rownum provide the row  um where you test deta
	 * @param cellnum provide you the cell which cell you want to read
	 * @return it return the deta into respective sheet 
	 */

	public String readStringData(String sheetname, int rownum, int cellnum) {
		Workbook workbook = null;
		try {
			File absPath = new File(excelPath);
			FileInputStream fis = new FileInputStream(absPath);
			workbook = WorkbookFactory.create(fis);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return workbook.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();

	}

	public  Date readDateData(String sheetname, int rownum, int cellnum) {
		Workbook workbook = null;
		try {
			File absPath = new File(excelPath);
			FileInputStream fis = new FileInputStream(absPath);
			workbook = WorkbookFactory.create(fis);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetname).getRow(rownum).getCell(cellnum).getDateCellValue();
	}

	public  double  readintData(String sheetname, int rownum, int cellnum) {
		Workbook workbook = null;
		try {
			File absPath = new File(excelPath);
			FileInputStream fis = new FileInputStream(absPath);
			workbook = WorkbookFactory.create(fis);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetname).getRow(rownum).getCell(cellnum).getNumericCellValue();
	}

	public  boolean  readBooleanData(String sheetname, int rownum, int cellnum) {
		Workbook workbook = null;
		try {
			File absPath = new File(excelPath);
			FileInputStream fis = new FileInputStream(absPath);
			workbook = WorkbookFactory.create(fis);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetname).getRow(rownum).getCell(cellnum).getBooleanCellValue();
	}


}
}

}


