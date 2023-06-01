package com.letskodeit.testclasses;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.Test;
import com.letscodeit.pageclasses.NavigationPage;
import com.letscodeit.pageclasses.LoginPage;
import com.letscodeit.pageclasses.ResultsPage;
import com.letscodeit.pageclasses.SearchBarPage;
import com.letskodeit.baseTest.BaseTest;

public class AllCoursesTest extends BaseTest {
//before in BaseTest class
	Logger log = LogManager.getLogger(AllCoursesTest.class);

	@Test
	public void verifySearchCourse() {
		LoginPage login = new LoginPage(driver);
		login.open();
		log.info("browser open");
		boolean title = login.VerifyingTitle("Login");
		System.out.println(title);
		NavigationPage nav = login.signInWith("rayhanc@yahoo.com", "Aarayhan00");
		nav.allCourses();
		boolean title1 = nav.VerifyingTitle("All Courses");
		System.out.println(title1);
		SearchBarPage search = new SearchBarPage(driver);
		ResultsPage result = search.course("rest api");
		boolean searchResult = result.verifySearchResult();
		Assert.assertTrue(searchResult);

	}

	// after in BaseTest class

}
