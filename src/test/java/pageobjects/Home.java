package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Framework.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Home extends BaseClass {
	AndroidDriver driver;
	public Home(AndroidDriver driver) {
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this); 
	}
	@AndroidFindBy(id ="com.Splitwise.SplitwiseMobile:id/groups")
	private WebElement btn_group;
	@AndroidFindBy(id ="com.Splitwise.SplitwiseMobile:id/add_friend_group_button")
	private WebElement btn_addNewGroup;
	@AndroidFindBy(id ="com.Splitwise.SplitwiseMobile:id/groupNameInputField")
	private WebElement txt_GroupName;
	@AndroidFindBy(id ="com.Splitwise.SplitwiseMobile:id/tripChip")
	private WebElement btn_typeTrip;
	@AndroidFindBy(id ="com.Splitwise.SplitwiseMobile:id/done")
	private WebElement btn_Done;
	@AndroidFindBy(id ="com.Splitwise.SplitwiseMobile:id/addMembersButton")
	private WebElement btn_AddGroupMem;
	@AndroidFindBy(id ="com.android.permissioncontroller:id/permission_allow_button")
	private WebElement btn_AllowContact;
	@AndroidFindBy(xpath ="(//android.widget.LinearLayout)[7]")
	private WebElement btn_Eleven;
	@AndroidFindBy(xpath ="(//android.widget.LinearLayout)[10]")
	private WebElement btn_Mike;
	@AndroidFindBy(id ="com.Splitwise.SplitwiseMobile:id/proceedAction")
	private WebElement btn_proceedNXT;
	@AndroidFindBy(id ="com.Splitwise.SplitwiseMobile:id/finish")
	private WebElement btn_Finish;
	
	public void Add_new_Group() {
		btn_group.click();
		btn_addNewGroup.click();
		txt_GroupName.sendKeys("New York");
		btn_typeTrip.click();
		btn_Done.click();
		btn_AddGroupMem.click();
		btn_AllowContact.click();
		btn_Eleven.click();
		btn_Mike.click();
		btn_proceedNXT.click();
		btn_Finish.click();
	}

}
