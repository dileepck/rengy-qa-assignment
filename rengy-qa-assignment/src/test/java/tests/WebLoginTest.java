package tests; 
import base.BaseTest; 
import org.openqa.selenium.By; 
import org.testng.Assert; 
import org.testng.annotations.Test; 
import utils.ScreenshotUtil; 
public class WebLoginTest extends BaseTest { 
@Test public void validLoginTest(){ 
try{ 
driver.findElement(By.id("username")).sendKeys("tomsmith"); 
driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!"); 
driver.findElement(By.cssSelector("button[type='submit']")).click(); 
String msg=driver.findElement(By.id("flash")).getText(); 
Assert.assertTrue(msg.contains("You logged into a secure area!")); 
Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed()); 
}catch(Exception e){ScreenshotUtil.capture(driver,"validError");throw e;} 
} 
@Test public void invalidLoginTest(){ 
try{ 
driver.findElement(By.id("username")).sendKeys("wrong"); 
driver.findElement(By.id("password")).sendKeys("wrong"); 
driver.findElement(By.cssSelector("button[type='submit']")).click(); 
String msg=driver.findElement(By.id("flash")).getText(); 
Assert.assertTrue(msg.contains("Your username is invalid!")); 
}catch(Exception e){ScreenshotUtil.capture(driver,"invalidError");throw e;} 
} 
} 
