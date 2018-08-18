package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void f1() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell laptop\\workspace\\UUU\\lib\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.seleniumhq.org/");
	  driver.quit();
	  
	  
	  
  }
  @Test
  public void f2() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell laptop\\workspace\\UUU\\lib\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.seleniumhq.org/");
	  driver.quit();
	  
  }
  @Test
  public void f3() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell laptop\\workspace\\UUU\\lib\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.seleniumhq.org/");
	  driver.quit();
	  
  }
}
