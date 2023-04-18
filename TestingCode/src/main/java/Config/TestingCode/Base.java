package Config.TestingCode;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base {
	public WebDriver driver;
	@BeforeMethod (alwaysRun=true)
	@Parameters({"url","brow"})
	public void beforeMethod(String url,String brow) throws InterruptedException {
	System.out.println("This is before method");
	if (url.contains("edge")) {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\navee\\eclipse-workspace\\TestingCode\\Drivercode\\msedgedriver.exe");
	driver= new EdgeDriver(); 
	}else if(url.contains("firefox")) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\navee\\eclipse-workspace\\TestingCode\\Drivercode\\geckodriver.exe");
	driver= new FirefoxDriver(); 
	}else
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\navee\\eclipse-workspace\\TestingCode\\Drivercode\\chromedriver.exe");
	driver= new ChromeDriver(); 
	}
	driver.get(url); 
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@class='fsl065w']")).click();
	}

	@AfterMethod (alwaysRun=true)
	public void afterMethod() {
	System.out.println("This is after method");
	driver.close();
	}
	public void shotsv2(String name) throws IOException {
	File cap=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(cap,new File("C:\\Users\\navee\\eclipse-workspace\\framwork\\screenshort\\"+name +".png")) ;

}
}