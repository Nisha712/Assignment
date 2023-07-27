package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class homepage {
	public WebDriver Driver;
	public homepage(WebDriver Driver)
	{
		this.Driver=Driver;
	}
	@FindBy(id="bigger") WebElement bigger;
	@FindBy(id="smaller") WebElement smaller;
	@FindBy(id="reset") WebElement reset;
	@FindBy(xpath="//*[@id=\"bigger\"]") WebElement xbigger;
	@FindBy(xpath="//*[@id=\"smaller\"]") WebElement xsmall;
	@FindBy(xpath="//*[@id=\"reset\"]") WebElement xreset;
	public void clickbig()
	{
		bigger.click();
	}
	public void clicksmal()
	{
		smaller.click();
	}
	public void clickreset()
	{
		reset.click();
	}
	public void clickxbig()
	{
		xbigger.click();
	}
	public void clickxsmall()
	{
		xsmall.click();
	}
	public void clickxreset()
	{
		xreset.click();
	}
}
