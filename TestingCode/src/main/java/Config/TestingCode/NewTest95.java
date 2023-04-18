package Config.TestingCode;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
public class NewTest95 extends Base {

@Test(groups={"regression"})
public void f1() throws InterruptedException, IOException {
	shotsv2("1"); //Take screenshort1
System.out.println("This is test1");
Thread.sleep(5000);
Home ob=new Home(driver);
ob.email_field_function("abc@yahoo.com");
Thread.sleep(5000);
ob.pass_field_function("qwe1242a");
Thread.sleep(5000);
shotsv2("2");// Take screenshort2
}
@Test(groups= {"second"})
public void f2() throws InterruptedException {
System.out.println("This is test2");
Thread.sleep(5000);
Home ob2=new Home(driver);
ob2.email_field_function("bcxo@yahoo.com");
Thread.sleep(5000);
ob2.pass_field_function("yhfvcf123");
}
//@Test(priority=3)/// Text Extract Function
//public void f3() throws InterruptedException {
//System.out.println("This is test3");
//Thread.sleep(5000);
//Home ob3=new Home(driver);
//ob3.text_extract_funtion();
//Thread.sleep(5000);
//}

}
