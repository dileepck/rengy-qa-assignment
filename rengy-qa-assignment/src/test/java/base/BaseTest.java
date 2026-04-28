package base; 
import org.openqa.selenium.*; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.testng.annotations.*; 
public class BaseTest { 
protected WebDriver driver; 
@BeforeMethod public void setup(){ 
System.setProperty("webdriver.chrome.driver","chromedriver.exe"); 
driver=new ChromeDriver(); 
driver.get("https://the-internet.herokuapp.com/login");} 
@AfterMethod public void tearDown(){driver.quit();} 
} 
