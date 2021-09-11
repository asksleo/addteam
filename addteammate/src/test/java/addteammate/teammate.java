package addteammate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class teammate {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\karan\\eclipse-workspace\\chromedriver.exe");
	  WebDriver t1 = new ChromeDriver();
	  t1.get("https://stage.clientvenue.com/login");
	  WebDriverWait var1= new WebDriverWait(t1,10);
	  var1.until(ExpectedConditions.elementToBeClickable(By.id("email")));
	  t1.findElement(By.id("email")).sendKeys("agency@gmail.co.in");
	  t1.findElement(By.id("password")).sendKeys("1234567");
	  t1.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[1]/div/div/div/form/button/span")).click();
Thread.sleep(4000);
      t1.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div[1]/div[2]/a[5]")).click();
      Thread.sleep(4000);
      t1.close();


	 
	        
	  
  }
}
