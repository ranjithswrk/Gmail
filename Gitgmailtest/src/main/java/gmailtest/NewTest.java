package gmailtest;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	
	Logger log = Logger.getLogger(NewTest.class);
	
  @Test
  public void gmailtest() {
	  System.setProperty("webdriver.chrome.driver", 
	            "C:\\Users\\RE041943\\Desktop\\information\\Training\\selenium\\Selenium Installers\\To_Work_with_chrome_broswer\\chromedriver.exe"); 
	  BasicConfigurator.configure();
	  WebDriver driver; 
	  driver = new ChromeDriver();
	  String Exp_Res = "ssss";
	  	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get("https://gmail.com");
	  driver.findElement(By.id("Email")).sendKeys("ranjithswrk");
	  driver.findElement(By.id("next")).click();
	  driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("Ranjith@143");
	  driver.findElement(By.xpath(".//*[@id='signIn']")).click();
	  
	  String actual = driver.getTitle();
	  if (actual.equalsIgnoreCase(Exp_Res))
		{
			log.info("PASS");
		}
		else
		{
			log.error("FAIL");
			
		}
	  
  }
}
