package com.letscodeit.pageclasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultsPage {
	public ResultsPage(WebDriver driver) {
		this.driver = driver;

	}

	WebDriver driver;
	private String URL = "courses";
	private String COURSE_LIST = "//div[@id='course-list']";

	public boolean isOpen() {
		return driver.getCurrentUrl().contains(URL);

	}

	public int courseCount() {
		List<WebElement> courseList = driver.findElements(By.xpath(COURSE_LIST));

		return courseList.size();

	}

	public boolean verifySearchResult() {
		boolean result = false;
		if (courseCount() > 0) {
			result = true;

		}
		result = isOpen() && result;
		return result;

	}

}
