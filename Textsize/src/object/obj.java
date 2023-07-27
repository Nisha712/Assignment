package object;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.homepage;


public class obj extends basetest {
  @Test(description="click bigger button using id")
  public void f() throws Exception {
	  homepage hp=PageFactory.initElements(Driver, homepage.class);
	  hp.clickbig();
	  Thread.sleep(2000);
  }
  @Test(description="click smaller button using id")
  public void f1() throws Exception {
	  homepage hp=PageFactory.initElements(Driver, homepage.class);
	  hp.clicksmal();
	  Thread.sleep(2000);
  }
  @Test(description="click reset button using id")
  public void f3() throws Exception {
	  homepage hp=PageFactory.initElements(Driver, homepage.class);
	  hp.clickreset();
	  Thread.sleep(2000);
  }
  @Test(description="click bigger button using xpath")
  public void f4() throws Exception {
	  homepage hp=PageFactory.initElements(Driver, homepage.class);
	  hp.clickxbig();
	  Thread.sleep(2000);
  }
  @Test(description="click smaller button using xpath")
  public void f5() throws Exception {
	  homepage hp=PageFactory.initElements(Driver, homepage.class);
	  hp.clickxsmall();
	  Thread.sleep(2000);
  }
  @Test(description="click reset button using xpath")
  public void f6() throws Exception {
	  homepage hp=PageFactory.initElements(Driver, homepage.class);
	  hp.clickxreset();
	  Thread.sleep(2000);
  }
}
