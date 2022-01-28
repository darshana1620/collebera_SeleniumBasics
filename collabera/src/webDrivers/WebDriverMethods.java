package webDrivers;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/");
		driver.get("https://www.swiggy.com/");
		driver.get("https://en.wikipedia.org/wiki/New_Year");
		driver.get("https://en.wikipedia.org/wiki/Holi");
		
		
		
//C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe
	}

}
