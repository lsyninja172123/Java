package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import runner.TestRunner;

public class LoginPage extends TestRunner {
	//public static WebDriver driver;
@FindBy(id="txtUsername")
public static WebElement userName;

public static WebElement getUserName() {
	return userName;
}


public static void setUserName(WebElement userName) {
	LoginPage.userName = userName;
}


public static WebElement getPassword() {
	return password;
}


public static void setPassword(WebElement password) {
	LoginPage.password = password;
}


public static WebElement getBtnLogin() {
	return btnLogin;
}


public static void setBtnLogin(WebElement btnLogin) {
	LoginPage.btnLogin = btnLogin;
}


public static WebDriver getDriver() {
	return driver;
}


@FindBy(id="txtPassword")
public static WebElement password;


@FindBy(id="btnLogin")
public static WebElement btnLogin;

@FindBy(id="welcome")
public static WebElement logoutIcon;

public static WebElement getLogoutIcon() {
	return logoutIcon;
}


public static void setLogoutIcon(WebElement logoutIcon) {
	LoginPage.logoutIcon = logoutIcon;
}


public static WebElement getLogout() {
	return logout;
}


public static void setLogout(WebElement logout) {
	LoginPage.logout = logout;
}


@FindBy(xpath="//a[text()='Logout']")
public static WebElement logout;


public LoginPage(WebDriver ldriver){
	this.driver=ldriver;
	PageFactory.initElements(driver, this);
	
}

}
