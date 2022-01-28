package basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingfirefoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\ADMIN\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	}

}
