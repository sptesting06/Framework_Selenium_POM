package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	static WebDriver driver;
	static String browser;
	static String url;
	
	public static void readConfig() {
		
	Properties prop = new Properties();
	
	try {
	InputStream Input = new FileInputStream("src\\main\\java\\config\\config.properties");
	prop.load(Input);
	browser = prop.getProperty("browser");
	url = prop.getProperty("url");
	
	} catch (IOException e) {
		e.getStackTrace();
	}

	}
	
	public static WebDriver init() {
		readConfig();
	
	if (browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		driver = new ChromeDriver();	
	}
	else if(browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver","driver\\geckodriver.exe");
	driver = new FirefoxDriver();	
	}	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(url);
	return driver;
	
	}
	
	
	public static void tearDown() {
		driver.close();
		driver.quit();
	
}
}
