package obj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.cal_page;

public class cal_obj extends cal_basetest
{
	 
	 
  @Test(description="Test case to enter date using id")
  public void f1() throws Exception {
	  cal_page cp=PageFactory.initElements(Driver, cal_page.class);
	  cp.date();
	  Thread.sleep(1000);
  }
  @Test(description="Test case to click calculate  using id")
  public void f2() throws Exception {
	  cal_page cp=PageFactory.initElements(Driver, cal_page.class);
	  cp.cal();
	  Thread.sleep(2000);
  }
  @Test(description="Test case to enter date using xpath")
  public void f3() throws Exception {
	  cal_page cp=PageFactory.initElements(Driver, cal_page.class);
	 
	  cp.xdate();
	  Thread.sleep(1000);
  }
  @Test(description="Test case to click calculate  using xpath")
  public void f4() throws Exception {
	  cal_page cp=PageFactory.initElements(Driver, cal_page.class);
	  cp.xcal();
	  Thread.sleep(1000);
	  
  }
  
}
