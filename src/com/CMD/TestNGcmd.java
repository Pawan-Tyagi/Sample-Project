package com.CMD;




import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;


import java.net.MalformedURLException;
import java.net.URL;

public class TestNGcmd {



static WebDriver driver;

public static final String USERNAME = "pawantg7";
public static final String ACCESS_KEY = "5709ac03-09dd-43f7-b456-01e930926fd8";
public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY
		+ "@ondemand.saucelabs.com:443/wd/hub";
	
	@BeforeClass
	public static void Browser() throws InterruptedException, MalformedURLException
	
	{
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 10");
		caps.setCapability("name", "Simple Java Code");
		caps.setCapability("version", "59.0");

		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id='username']")).sendKeys(
				"testgoogledc_qa@10kview.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(
				"C0ncret101234");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		Thread.sleep(10000);
		
	}

		@Test(priority=1)
		public void run()
		{
			System.out.println("....Hi This is first test....");
			 System.setProperty("webdriver.chrome.driver",
						"C:\\Selenium\\DoubleClick\\lib\\chromedriver.exe");
			
			 driver = new ChromeDriver();
					System.out.println("Launching browser");
					
			
		
			
			driver.navigate().to("https://login.salesforce.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);
			System.out.println(driver.getTitle());
				
		}
		
		/*@Test(priority=2)
		public void Secondtest() throws MalformedURLException, InterruptedException
		{
					
				DesiredCapabilities caps = DesiredCapabilities.chrome();
				caps.setCapability("platform", "Windows 10");
				caps.setCapability("name", "Simple Java Code");
				caps.setCapability("version", "59.0");

				WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
				driver.get("https://login.salesforce.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);

				driver.findElement(By.xpath("//*[@id='username']")).sendKeys(
						"testgoogledc_qa@10kview.com");
				driver.findElement(By.xpath("//*[@id='password']")).sendKeys(
						"C0ncret101234");
				driver.findElement(By.xpath("//*[@id='Login']")).click();
				Thread.sleep(10000);
				driver.quit();
		}*/
	
			
		//New comments
		@Test(priority=3)
		public void close()
		{
			driver.close();
		}
	}
	
		
		

	

	
		
		

	

