package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotReplacement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		
		driver.get("https://www.swiggy.com/");
		File tempFile=driver.getScreenshotAs(OutputType.FILE);
		System.out.println(tempFile);
		
		File destFile=new File("./errorshot/ss1.png");
		
		FileUtils.copyFile(tempFile,destFile);

	}

}
