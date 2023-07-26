package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class cal_page {
	public WebDriver Driver;
	public cal_page(WebDriver Driver)
	{
		this.Driver=Driver;
	}
	@FindBy(id="birth_date") WebElement bdate;
	@FindBy(id="calculate") WebElement calculate;
	@FindBy(xpath="//*[@id=\"birth_date\"]") WebElement xbdate;
	@FindBy(xpath="//*[@id=\"calculate\"]") WebElement xcalculate;

	public void date()
	{
		bdate.sendKeys("01/12/1998");
	}
	public void cal()
	{
		calculate.click();
	}
	public void xdate()
	{
		String s="02/26/2000";
		xbdate.sendKeys(s);
	}
	public void xcal()
	{
		xcalculate.click();
	}
	
}
