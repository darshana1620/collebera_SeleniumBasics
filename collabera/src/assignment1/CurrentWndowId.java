package assignment1;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentWndowId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.Facbook.com/");
		String Window=driver.getWindowHandle();
		driver.get("https://www.naukri.com/");
		System.out.println(Window);
	}

}
