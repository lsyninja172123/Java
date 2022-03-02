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

public class DashBoardlistScreenshot {
	WebDriver driver = TestRunner.driver;
	LoginPage loginPage;
	
	@Given("user in login page")
	public void user_in_login_page() {
		System.out.println("User logged in");
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("user in homepage")
	public void user_in_homepage() {
		loginPage = new LoginPage(driver);
		loginPage.getUserName().sendKeys("Admin");
		System.out.println("User entered the username");
		loginPage.getPassword().sendKeys("admin123");
		System.out.println("User entered the password");
	}

	@Then("taking screenshot  for launch panel list")
	public void taking_screenshot_for_launch_panel_list() throws IOException {
		TakesScreenshot sc=(TakesScreenshot)driver;
		File source = sc.getScreenshotAs(OutputType.FILE);
		File des=new File("E:\\Eclipse_Workspace\\JiraProject\\Screenshots\\panellist.jpeg");
		FileHandler.copy(source, des);
		System.out.println("Screenshot taken successfully");
		System.out.println("DashBoardlistScreenshot Testcase successfully executed");
	}
}
