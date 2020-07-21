package selenium;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class intro {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\varun\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	 // open one method
	driver.get("http://facebook.com");
	
	// other method 
	 driver.navigate().to("http://google.com");
	 driver.manage().window().maximize();
		
	 driver.manage().window().fullscreen();

	  Point p=new Point(500, 400);
	 driver.manage().window().setPosition(p);
	
Thread.sleep(5000);
driver.quit();

	}
}