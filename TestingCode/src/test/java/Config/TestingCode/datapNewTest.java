package Config.TestingCode;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class datapNewTest {
	public static WebDriver driver;
	
  @Test(dataProvider = "dp")
  public void f(String emails, String passwords) {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\navee\\eclipse-workspace\\TestingCode\\Drivercode\\chromedriver.exe");
		driver= new ChromeDriver(); 
	  driver.get("https://www.facebook.com");
	  
	  driver.findElement(By.id("email")).sendKeys(emails);
	  driver.findElement(By.id("pass")).sendKeys(passwords);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "abc@yahoo.com", "aaaaaa" },
      new Object[] { "def@yahoo.com", "bbbbbbbb" },
    };
  }
}
