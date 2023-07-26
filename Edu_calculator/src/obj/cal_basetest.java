package obj;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class cal_basetest {
	public WebDriver Driver;
  @BeforeSuite
  public void beforeSuite() {
	  System.setProperty("webdriver.chrome.driver","./chrome/chromedriver.exe");
      Driver=new ChromeDriver();
     Driver.navigate().to(" https://selenium-apps.doselect.in/age-calculator/");

     Driver.manage().window().maximize();
  }

}
