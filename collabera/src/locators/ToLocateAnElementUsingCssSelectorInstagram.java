package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateAnElementUsingCssSelectorInstagram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[aria-label='Phone number, username or email address']")).sendKeys("darshana2302");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("abcfygyt123");
		driver.findElement(By.cssSelector("button[class='sqdOP  L3NKy   y3zKF     ']")).click();
		
		
		Thread.sleep(3000);
		driver.get("https://www.zomato.com/");
		
		

		

	}

}
