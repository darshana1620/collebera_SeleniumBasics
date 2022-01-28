package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadDifferentDataTypesFromExcel {

	public static void main(String[] args) throws IOException, InvalidFormatException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./testResources/testData.xlsx");
		
		Workbook workbook=WorkbookFactory.create(fis);
		String data =workbook.getSheet("Sheet1").getRow(1).getCell(1).toString();
		System.out.println(data);	
		
		/*Row row1=workbook.getSheet("Sheet2").getRow(1);
		String data1=row1.getCell(1).getStringCellValue();
		boolean data2=row1.getCell(2).getStringCellValue();
		Date data3=row1.getCell(3).getStringCellValue();
		LocalDateTime data4=row1.getCell(4).getStringCellValue();
		double data5=row1.getCell(5).getStringCellValue();*/
		

	}

}
