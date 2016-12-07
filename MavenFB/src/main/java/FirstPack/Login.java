package FirstPack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	public static void main(String[] args) throws InterruptedException  {
		
		
		WebDriver d=new FirefoxDriver();
		EventFiringWebDriver driver=new EventFiringWebDriver(d);
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("balaji111om@gmail.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("balaji83");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(".//*[@id='u_0_l']")).click();
		
		driver.findElement(By.xpath(".//*[@id='pagelet_welcome_box']/ul/li/div/a")).click();
		//driver.findElement(By.xpath(".//*[@id='u_jsonp_8_1u']/div/div[1]/div/div[1]/div/div/div[2]/div/a/span")).click();
		
		//driver.executeScript("alert('Hello World')");
	}

}
