package object;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;

public class basetest {
	public WebDriver Driver;
  @BeforeSuite
  public void beforeSuite() {
	  System.setProperty("webdriver.chrome.driver","./chrome/chromedriver.exe");
      Driver=new ChromeDriver();
     Driver.navigate().to(" https://selenium-apps.doselect.in/change-text/");

     Driver.manage().window().maximize();
  }

}
