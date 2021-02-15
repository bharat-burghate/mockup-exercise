package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ExerciseValuesPage;

public class MockUpStepDefinition {
	private WebDriver webDriver;
	ExerciseValuesPage eValues = new ExerciseValuesPage(webDriver);

	@Given("User loads chromedriver")
	public void user_loads_chromedriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();

	}

	@When("user opened site https:\\/\\/www.exercise1.com\\/values")
	public void user_opened_site_https_www_exercise1_com_values() {
		webDriver.get("https://www.exercise1.com/values");
	}

	@Then("right count of values appear on the screen")
	public void right_count_of_values_appear_on_the_screen() {
		Assert.assertEquals(eValues.countOfValues(), eValues.countOfLabels());
	}
	
	@Then("values on the screen are greater than zero")
	public void values_on_the_screen_are_greater_than_zero() {
		Assert.assertTrue(eValues.areValuesGreaterThanZero());
	}


	@Then("total balance is correct based on the values listed on the screen")
	public void total_balance_is_correct_based_on_the_values_listed_on_the_screen() {
		Assert.assertEquals(eValues.actualTotalBalance(), eValues.getTotalBalance());
	}

	@Then("values are formatted as currencies")
	public void values_are_formatted_as_currencies() {
		Assert.assertTrue(eValues.areValuesFormatted());
	}

	@Then("total balance matches the sum of the values")
	public void total_balance_matches_the_sum_of_the_values() {
		Assert.assertEquals(eValues.actualTotalBalance(), eValues.getTotalBalance());
	}
}
