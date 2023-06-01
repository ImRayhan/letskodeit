package com.letscodeit.pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.letskodeit.basePage.BasePage;

import utilities.Util;

public class NavigationPage extends BasePage {

	public NavigationPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public WebDriver driver;
	private String ALL_COURSES_LINK = "ul[class='nav navbar-nav pull-center dynamic_menu_texts'] li:nth-child(3) a:nth-child(1)";
	private String URL = "https://www.letskodeit.com/courses";
	private String MY_COURSES_LINK = "//a[normalize-space()='MY COURSES']";

	public void allCourses() {
		driver.findElement(By.cssSelector(ALL_COURSES_LINK)).click();

	}
	public void myCourses() {
		driver.findElement(By.cssSelector(MY_COURSES_LINK)).click();
		
	}

//	public boolean isOpen() {
//
//		return URL.equalsIgnoreCase(driver.getCurrentUrl());
//
//	}

}
