package gmailtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void gmailtest() {
	  System.setProperty("webdriver.chrome.driver", 
	            "C:\\Users\\RE041943\\Desktop\\information\\Training\\selenium\\Selenium Installers\\To_Work_with_chrome_broswer\\chromedriver.exe"); 
	 
	  WebDriver driver; 
	  driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get("https://gmail.com");
	  driver.findElement(By.id("Email")).sendKeys("ranjithswrk");
	  driver.findElement(By.id("next")).click();
	  driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("Ranjith@143");
	  driver.findElement(By.xpath(".//*[@id='signIn']")).click();
	  driver.findElement(By.xpath("//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span ")).click();
	  
	  driver.findElement(By.cssSelector("#gb_71")).click();
  }
}
