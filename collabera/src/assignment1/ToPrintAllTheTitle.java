package assignment1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToPrintAllTheTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://company.naukri.com/popups/techmahindra/9dec2021/index.html");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://company.naukri.com/popups/icici/23072021/index.html");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://company.naukri.com/popups/techmahindra/9dec2021/index.html");
		System.out.println(driver.getTitle());
		

	}

}
