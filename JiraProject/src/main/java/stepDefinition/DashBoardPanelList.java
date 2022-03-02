package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.LoginPage;
import runner.TestRunner;

public class DashBoardPanelList {
	WebDriver driver = TestRunner.driver;
	LoginPage loginPage;
	
	@Given("user should be in login page")
	public void user_should_be_in_login_page() {
		System.out.println("User logged in");
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("user should be in homepage")
	public void user_should_be_in_homepage() {
		
		loginPage = new LoginPage(driver);
		loginPage.getUserName().sendKeys("Admin");
		System.out.println("User entered the username");
		loginPage.getPassword().sendKeys("admin123");
		System.out.println("User entered the password");
	}

	@Then("user can get the launch panel list")
	public void user_can_get_the_launch_panel_list() {
      List<WebElement> list = driver.findElements(By.xpath("//div[@id='dashboard-quick-launch-panel-menu_holder']/table/tbody/tr/td/div/a/span"));
	for (WebElement names : list) {
		System.out.println(names.getText());
	}
	System.out.println("Dashboard Panel List Testcase successfully executed");
	}
}
