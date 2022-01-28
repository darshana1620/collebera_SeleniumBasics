package assignment1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTitleUrlPageSource {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
		
		driver.get("https://www.flipkart.com/");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		



	}

}
