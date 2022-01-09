package test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TotalLinks {
WebDriver driver;
@Test
public void linkfind() {
	System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/popup.php");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	List<WebElement> totallinks = driver.findElements(By.tagName("a"));
	int size  = totallinks.size();
	System.out.println(size);
	for(WebElement s:totallinks) {
	System.out.println(s);
	}
	System.out.println("----------------------");
	
	System.out.println(driver.getTitle());
	driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
	
	//find handle for open window
	String parentwindowhandle = driver.getWindowHandle();
	System.out.println(parentwindowhandle);
	//find handle for all open windows
	Set<String> totallinkopen = driver.getWindowHandles();
	System.out.println("total number of links:"+totallinkopen.size());
	for (String t : totallinkopen) {
		System.out.println(t);
	}
	Iterator<String> it = totallinkopen.iterator();
	String childwindow = it.next();
	System.out.println("tHIS IS CHILD WINDOW"+childwindow);
if(!parentwindowhandle.equalsIgnoreCase(childwindow)) {
	driver.switchTo().window(childwindow);
	String currenthandle = driver.getWindowHandle();

	System.out.println(currenthandle);

	//driver.findElement(By.xpath("input[@name='emailid']")).sendKeys("shilpa@hotmail.com");
}
else {
	System.out.println("both are equal");
	
}
}
}
