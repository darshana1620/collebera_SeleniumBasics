package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotOfWebElementOfZomato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		
		driver.get("https://www.zomato.com/");
		File tempFile=driver.getScreenshotAs(OutputType.FILE);
		System.out.println(tempFile);
		
		File destFile=new File("./errorshot/ss1.png");
		
		tempFile.renameTo(destFile);
		File weSS=driver.findElement(By.xpath("//span[text()='Share App Link']")).getScreenshotAs(OutputType.FILE);
		File destFile1=new File("./errorshot/ss2.png");
		weSS.renameTo(destFile1);

	}

}
