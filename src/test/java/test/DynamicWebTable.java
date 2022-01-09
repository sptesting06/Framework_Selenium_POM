package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicWebTable {

	WebDriver driver;

	@Test
	public void opentable() {
		System.setProperty("webdriver.chrome.driver", ".//Driver//chromeDriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// No of columns in table
		List<WebElement> col = driver.findElements(By.xpath("//table/thead/tr/th"));
		System.out.println("Number of Columns: " + col.size());

		// No of rows in table
		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("Number of Rows: " + rows.size());

		// table row text
		WebElement rowtext = driver.findElement(By.xpath("//table/tbody/tr[1]"));
		String rowtextvisible = rowtext.getText();
		System.out.println("Text inside this row is "+rowtextvisible);
		
		// table column text
		WebElement coltext = driver.findElement(By.xpath("//table/tbody/tr[1]/td[4]"));
		String coltextvisible = coltext.getText();
		System.out.println("Text inside this column is "+coltextvisible);
		driver.close();
	}

}
