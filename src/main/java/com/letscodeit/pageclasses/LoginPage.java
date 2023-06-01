package com.letscodeit.pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.letskodeit.basePage.BasePage;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	public WebDriver driver;
	private String LOGIN_LINK = "//a[normalize-space()='Sign In']";
	private String EMAIL_FIELD = "//form[@name='loginform']//input[@id='email']";
	private String PASSWORD_FIELD = "//input[@id='login-password']";
	private String LOG_IN_BUTTON = "login";

	public void open() {
		driver.findElement(By.xpath(LOGIN_LINK)).click();

	}

	public NavigationPage signInWith(String email, String password) {
		WebElement emailField = driver.findElement(By.xpath(EMAIL_FIELD));
		emailField.clear();
		emailField.sendKeys(email);

		WebElement passWordField = driver.findElement(By.xpath(PASSWORD_FIELD));
		passWordField.clear();
		passWordField.sendKeys(password);

		WebElement loginButton = driver.findElement(By.id(LOG_IN_BUTTON));
		loginButton.click();
		return new NavigationPage(driver);

	}

}
