package javaScriptExecutorMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClearTheData {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement utf=driver.findElement(By.id("username"));
		utf.sendKeys("Darshana");
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String title=(String)js.executeScript("return document.title");
		System.out.println(title);
		

	}

}
