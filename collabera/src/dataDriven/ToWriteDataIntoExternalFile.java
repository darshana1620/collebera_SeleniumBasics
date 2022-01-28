package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ToWriteDataIntoExternalFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("G:\\doc.txt");
		
		fos.write('D');
		fos.write('A');
		fos.write('R');
		fos.write('S');
		fos.write('H');
		fos.write('A');
		fos.write('N');
		fos.write('A');
		

	}

}
