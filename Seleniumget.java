package selenium;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumget {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\varun\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		driver.get("http://facebook.com");
		 String store = driver.getPageSource();// to get pagesourse
		 System.out.println(store);
		 // storing source in a new file 
		 //new file 
		 // new filewritter
		 
		 File f=new File("C:\\\\Users\\\\varun\\\\Documents\\\\Project\\\\sourcetest.txt\\\\");
		 FileWriter f1= new FileWriter(f);// file writer is used write // making the file file ready to get written
		 f1.write(store);
		 f1.close();
		driver.quit();
	}

}
