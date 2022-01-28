package pop_Ups;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleFilePopUps {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com");
		
		driver.findElement(By.id("login_Layer")).click();
		driver.findElement(By.xpath(null));
		driver.findElement(By.xpath(null));
		driver.findElement(By.xpath(null));
		
		Thread.sleep(3000);
		driver.findElement(By.xpath(null));
		
		Runtime.getRuntime().exec("./autoIt/fileUpload.exe");
		
		

	}

}
