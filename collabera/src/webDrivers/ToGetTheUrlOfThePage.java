package webDrivers;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheUrlOfThePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://github.com/");
		String url=driver.getCurrentUrl();
	
		System.out.println(url);


	}

}
