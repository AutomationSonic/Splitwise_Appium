package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Jump_AppExpense {
	AndroidDriver driver;
	public Jump_AppExpense(AndroidDriver driver) {
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this); 
	}
	@AndroidFindBy(id ="com.Splitwise.SplitwiseMobile:id/fab")
	private WebElement btn_Add_Expense;
	public void Add_expenses() {
		Activity activity = new Activity("com.Splitwise.SplitwiseMobile", "com.Splitwise.SplitwiseMobile.views.DashboardActivity");
		driver.startActivity(activity);
		
	}

}
