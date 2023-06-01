package com.letskodeit.baseTest;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	public WebDriver driver;
	protected String baseUrl;
	Logger log;

	@BeforeClass
	public void setup() {
		log=LogManager.getLogger(BaseTest.class);
		driver = new ChromeDriver();
		log.info("Chromedriver setup is complete");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		log.info("implichit wait 5 secound");
		baseUrl = "https://www.letskodeit.com/";
		log.info("basurl open");
		driver.get(baseUrl);

	}

	@AfterClass
	public void tearDown() {
		log.info("quit the browser");
		driver.quit();

	}
}
