package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyErrorMsgInSkillrary {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.skillrary.com/user/login");
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		
		String expectedErrorMsg="Email Field is Required";
		
		WebElement errorMsgElement = driver.findElement(By.id("email-error"));
		String actualErrorMsg=errorMsgElement.getText();
		System.out.println(actualErrorMsg);
		
		if(expectedErrorMsg.equals(actualErrorMsg)) {
			System.out.println("Proper error message is displayed");
		}
		else {
			System.out.println("Invalid error Message");
		}
		

	}

}
