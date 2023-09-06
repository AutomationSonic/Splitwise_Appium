package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Framework.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Login extends BaseClass{
	
	AndroidDriver driver;
	public Login(AndroidDriver driver) {
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this); 
	}
	@AndroidFindBy(id ="com.Splitwise.SplitwiseMobile:id/loginButton")
	private WebElement btn_login;
	@AndroidFindBy(id ="com.Splitwise.SplitwiseMobile:id/emailInputField")
	private WebElement txt_email;
	@AndroidFindBy(id ="com.Splitwise.SplitwiseMobile:id/passwordInputField")
	private WebElement txt_password;
	@AndroidFindBy(id  ="com.Splitwise.SplitwiseMobile:id/loginButton")
	private WebElement btn_submit;
	@AndroidFindBy(xpath ="(//android.widget.LinearLayout)[8]")
	private WebElement slide_01;
	@AndroidFindBy(xpath ="(//android.widget.LinearLayout)[9]")
	private WebElement slide_02;
	@AndroidFindBy(xpath ="(//android.widget.LinearLayout)[10]")
	private WebElement slide_03;
	@AndroidFindBy(id ="com.Splitwise.SplitwiseMobile:id/tourGetStartedText")
	private WebElement tap_anywhere;
	@AndroidFindBy(id ="com.Splitwise.SplitwiseMobile:id/skipButton")
	private WebElement btn_skipSetup;

public void complete_signin(String Email,String Password) {
	btn_login.click();
	driver.hideKeyboard();
	txt_email.sendKeys(Email);
	driver.hideKeyboard();
	txt_password.sendKeys(Password);
	btn_submit.click();
//	slide_01.click();
//	slide_02.click();
	slide_03.click();
	tap_anywhere.click();
//	btn_skipSetup.click();
}
}