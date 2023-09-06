package Framework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.Home;
import pageobjects.Login;

public class Splitwise_Test extends BaseClass {
	@Test(dataProvider = "getData")
	public void login(String Email,String Password) {
		Login login = new Login(driver);
		login.complete_signin(Email, Password);
		Home home = new Home(driver);
		home.Add_new_Group();
	}
	@DataProvider
	public Object[][] getData() {
		return new Object[][] {{"vahox97498@searpen.com","Quali@2022"}};
	}

}
