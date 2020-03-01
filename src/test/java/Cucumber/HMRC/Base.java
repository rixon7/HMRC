package Cucumber.HMRC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	public static Properties prop;

	public static WebDriver getDriver() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\Cucumber\\HMRC\\global.properties");
		
		prop.load(fis);

	    System.setProperty("webdriver.chrome.driver",(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\chromedriver.exe"));
		
		   	 driver=new ChromeDriver();
   	 
   	 

   	 
  	driver.get(prop.getProperty("url"));
  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   	 return driver;
		
	}
	
	
	
}
