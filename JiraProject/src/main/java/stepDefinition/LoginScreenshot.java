package stepDefinition;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.LoginPage;
import runner.TestRunner;

public class LoginScreenshot {
	WebDriver driver = TestRunner.driver;
	LoginPage loginPage;
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		System.out.println("User logged in");
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}

	@When("user enters the username and password")
	public void user_enters_the_username_and_password() {
		loginPage = new LoginPage(driver);
		loginPage.getUserName().sendKeys("Admin");
		System.out.println("User entered the username");
		loginPage.getPassword().sendKeys("admin123");
		System.out.println("User entered the password");
	}

	@Then("user taking the screenshot")
	public void user_taking_the_screenshot() throws IOException {
		TakesScreenshot sc=(TakesScreenshot)driver;
		File source = sc.getScreenshotAs(OutputType.FILE);
		File des=new File("E:\\Eclipse_Workspace\\JiraProject\\Screenshots\\fullimage.jpeg");
		FileHandler.copy(source, des);
		System.out.println("Screenshot taken successfully");
		System.out.println("Login screenshot Testcase successfully executed");
	}
}
