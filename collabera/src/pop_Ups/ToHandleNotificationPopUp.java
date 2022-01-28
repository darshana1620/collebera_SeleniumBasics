package pop_Ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleNotificationPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("--disable-notification");
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebDriverWait explixitWait=new WebDriverWait(driver,15);
		
		driver.get("https://www.yatra.com");
		
		/*Thread.sleep(2000);
		
		Robot robot=new Robot();
		robot.keyPress(keyEvent.VK_TAB);
		Thread.sleep(1000);
		
		Robot robot=new Robot();
		robot.keyPress(keyEvent.VK_TAB);
		Thread.sleep(1000);
		
		Robot robot=new Robot();
		robot.keyPress(keyEvent.VK_TAB);
		Thread.sleep(1000);
		
		Robot robot=new Robot();
		robot.keyPress(keyEvent.VK_TAB);
		Thread.sleep(1000);
		
		Robot robot=new Robot();
		robot.keyPress(keyEvent.VK_TAB);
		Thread.sleep(1000);*/

	}

}
