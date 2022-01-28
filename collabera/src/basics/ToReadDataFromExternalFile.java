package basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ToReadDataFromExternalFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("G:\\demo.txt");
				int c=fis.read();
				while(c!=-1)
				{
					System.out.print((char)c);
					c=fis.read();
					Thread.sleep(2000);
				}
					

	}

}
