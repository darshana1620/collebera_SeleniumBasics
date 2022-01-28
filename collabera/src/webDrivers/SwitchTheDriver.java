package webDrivers;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTheDriver {
	private static Object expectedWindowTitle;

	public static void main(String[]args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com");
		Set<String> allWindowIds=driver.getWindowHandles();
		String exceptedWindowTitle="Tech Mahindra";
		
		for(String windowId:allWindowIds) {
			driver.switchTo().window(windowId);
			String actualWindowTitle=driver.getTitle();
			if(expectedWindowTitle.equals(actualWindowTitle)) {
				driver.manage().window().maximize();
			}
				
			}
		}



	}
