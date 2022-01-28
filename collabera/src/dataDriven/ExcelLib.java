package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
/***
 * 
 * @author DARSHANA
 *
 */

public class ExcelLib {private static final String WorkbookFactory = null;
//ExcelUtility
	
	static String excelPath="./testResources/testData.xlsx";
	
	
	public static String readStringData(String sheetName,int rowNum,int cellNum) {
		FileInputStream fis=new FileInputStream("./testResources/testData.xlsx");
		
		Workbook workbook=WorkbookFactory.create(fis);
		
		String data=workbook.getSheet("Sheet2").getRow(0).getCell(0).toString();
		System.out.println(data);
	
		
		//return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		
			
			
			
			
		}
	}

}
