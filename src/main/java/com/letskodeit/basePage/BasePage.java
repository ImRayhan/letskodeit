package com.letskodeit.basePage;

import org.openqa.selenium.WebDriver;

public class BasePage {
	WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean VerifyingTitle(String expectedTitle) {
		return driver.getTitle().equalsIgnoreCase(expectedTitle);

	}

}
