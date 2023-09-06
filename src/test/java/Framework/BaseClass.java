package Framework;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseClass {
	public AndroidDriver driver ;
	public AppiumDriverLocalService service;
	
	@BeforeClass
	public void ConfigureAppium() throws MalformedURLException {
//			service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\shreyas.hc\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
//					.withIPAddress("127.0.0.1").usingPort(4723).build();
//			service.start();
			UiAutomator2Options options = new UiAutomator2Options();
			options.setDeviceName("Shreyas Pixel");
			options.setChromedriverExecutable("C:\\Users\\shreyas.hc\\WorkSpace\\Appium\\src\\test\\java\\resources\\chromedriver.exe");
			options.setApp("C:\\Users\\shreyas.hc\\WorkSpace\\Splitwise\\src\\test\\java\\APK\\splitwise-23-7-1.apk");
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	
	public void longPressAction(WebElement people) {
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId",((RemoteWebElement)people).getId(),
				"duration",2000));
	}
	public void scrollToEndAction() {
		boolean canScrollMore;
		do {
		 canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "left", 100, "top", 100, "width", 200, "height", 200,
			    "direction", "down",
			    "percent", 3.0
			));
		}while(canScrollMore);
	}
	public void swipeAction(WebElement people,String direction ) {
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				   "elementId",((RemoteWebElement)people).getId(),
				    "direction", direction,
				    "percent", 0.75
				));
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
//		service.stop();
	}

}