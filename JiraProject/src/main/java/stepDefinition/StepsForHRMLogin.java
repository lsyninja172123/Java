package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.LoginPage;
import runner.TestRunner;

public class StepsForHRMLogin {
	WebDriver driver = TestRunner.driver;
	LoginPage loginPage;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("User logged in");
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		loginPage = new LoginPage(driver);
		loginPage.getUserName().sendKeys("Admin");
		System.out.println("User entered the username");
		loginPage.getPassword().sendKeys("admin123");
		System.out.println("User entered the password");
	}

	@When("user clicks login button")
	public void user_clicks_login_button() {

		loginPage.getBtnLogin().click();
		System.out.println("User clicked the submit button");
	}

	@Then("user navigated to admin page and loggedout")
	public void user_navigated_to_admin_page() {
		loginPage.getLogoutIcon().click();
		loginPage.getLogout().click();
		System.out.println("User successfully logged out");
		System.out.println("Login Testcase successfully executed");
	}
}
