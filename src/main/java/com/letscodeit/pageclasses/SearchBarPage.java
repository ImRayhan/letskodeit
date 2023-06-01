package com.letscodeit.pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchBarPage {
	public SearchBarPage(WebDriver driver) {
		this.driver = driver;

	}

	WebDriver driver;

	private String SEARCH_COURSE_FIELD = "//input[@id='search']";
	private String SEARCH_COURSE_BUTTON = "//i[@class='fa fa-search']";

	public ResultsPage course(String courseName) {
		WebElement searchField = driver.findElement(By.xpath(SEARCH_COURSE_FIELD));
		searchField.clear();
		searchField.sendKeys(courseName);

		WebElement searchButton = driver.findElement(By.xpath(SEARCH_COURSE_BUTTON));
		searchButton.click();
		return new ResultsPage(driver);

	}

}
