package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class refresh {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\varun\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	
	driver.get("http://facebook.com");
	// to refresh 1 time
	driver.navigate().refresh();
	
	// to refersh many times(like 5 or more)
	for(int i = 0;i<5;i++)
	{
		driver.navigate().refresh();
	}
Thread.sleep(3000); 
	
	}

}
