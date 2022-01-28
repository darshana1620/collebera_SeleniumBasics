package javaScriptExecutorMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingTheElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.skillrary.com/");
		Object elementScroll = driver.findElement(By.xpath("//h3[text()='Testimonials ']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		
		
		//to stick to footer
		js.executeScript("arguments[0].scrollIntoView(false);",elementScroll);
		Thread.sleep(3000);
		
		//to stick to header
		js.executeScript("arguments[0].scrollIntoView(true);",elementScroll);
		
		
		
	}

}
