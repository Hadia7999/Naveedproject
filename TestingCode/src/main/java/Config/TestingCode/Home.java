package Config.TestingCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
public class Home {
public static WebDriver driver;
@FindBy(xpath="//*[@class='fsl065w']") WebElement signin_field;
@FindBy(xpath="//*[@type='email']")WebElement email_field;
@FindBy(xpath="//*[@type='password']")WebElement pass_field;	
@FindBy(xpath="//*[@type='submit']")WebElement login_field;	
@FindBy(xpath="//*[contains(text(),'Join over 5 million')]") WebElement rm_text;
public Home(WebDriver driver) {
Home.driver=driver;
PageFactory.initElements( driver,this);
}
public void email_field_function(String email) {
email_field.sendKeys(email);
}
public void pass_field_function(String pass) {
pass_field.sendKeys(pass);
}
public void login_button_function() {
login_field.click();
}
public void text_extract_funtion() throws InterruptedException {
String actual_text=rm_text.getText();
Thread.sleep(5000);
SoftAssert softassert = new SoftAssert();
softassert.assertEquals(actual_text,"Join over 5 million people worldwide who love Remitly");
System.out.println("This line is after hard assert fails");
softassert.assertAll();
}
}
