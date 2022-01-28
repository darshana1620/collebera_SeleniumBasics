package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckAlignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		WebElement userTextField=driver.findElement(By.id("email"));
		//System.out.println(userTextField.getSize());
		
		WebElement passwordTextField=driver.findElement(By.id("passContainer"));
		System.out.println(passwordTextField.getSize());
		

		
		

	}

}
