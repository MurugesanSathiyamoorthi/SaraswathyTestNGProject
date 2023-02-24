package generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.launchBrowser("chrome");
		test.maximizeWindow();
		test.launchApplication("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		

	}

	public void launchBrowser(String browserName) {
		switch (browserName) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver_109.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			break;
		case "edge":
			break;
		}

	}
	
	public void launchApplication(String url) {
		getDriver().get(url);
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public void maximizeWindow() {
		getDriver().manage().window().maximize();
	}

}
