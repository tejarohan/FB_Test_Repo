package FirstPack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SendingMessage {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("nlstest16@gmail.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("netlogic123");
		driver.findElement(By.xpath(".//*[@id='u_0_l']")).click();
		//WebElement chatBox =driver.findElement(By.xpath(".//*[@id='fbDockChatBuddylistNub']/a"));
		System.out.println("------------------------------------------");
		
		driver.findElement(By.xpath(".//*[@id='navItem_217974574879787']/a/div/span")).click();
		
		Thread.sleep(10000);
	}

}
