package runner;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="E:\\Eclipse_Workspace\\JiraProject\\src\\main\\java\\feature",
glue="stepDefinition",dryRun=false,strict=true,tags =(""))
public class TestRunner {
	public static WebDriver driver;
@BeforeClass
public static void start() {
	System.setProperty("webdriver.chrome.driver", "E:\\drivers\\Chrome_97\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
}
@AfterClass
public static void tearDown() {
	driver.quit();
}
}
