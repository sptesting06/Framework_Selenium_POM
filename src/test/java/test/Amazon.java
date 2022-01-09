package test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;
public class Amazon {
	WebDriver driver;
	@Test
	public void init() {
		System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https:www.amazon.com/");
		driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")).click();
		driver.findElement(By.name("email")).sendKeys("sujaykadam@hotmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Brave21*");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Cereve");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.className("a-size-base-plus a-color-base a-text-normal")).click();
		 Set<String> ids = driver.getWindowHandles();
	        Iterator<String> it = ids.iterator();
	        String parentId = it.next();
	        String childId = it.next();
	        driver.switchTo().window(childId);
	        driver.findElement(By.id("a-autoid-1-announce")).click();


		
		

		
	}
}
