package genericLib;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverutilities {
	
	public void dropdown(WebElement ele,String Text)
	{
		Select s=new Select(ele);
		s.deselectByVisibleText(Text);
	}
	
	public void mouseHover(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	public void rightclick(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	}
	
	public void doubleClick(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
		
		public void dragAnddrop(WebDriver driver,WebElement src,WebElement target)
		{
			Actions a=new Actions(driver);
			a.dragAndDrop(src, target).perform();
		}
		
		public void switchtoFrame(WebDriver driver)
		{
			driver.switchTo().frame(0);
		}
		
		public void switchbackFrame(WebDriver driver)
		{
			driver.switchTo().defaultContent();
		}
		
		public void alertpopup(WebDriver driver)
		{
			driver.switchTo().alert().accept();
		}
		
		public void swicthTabs(WebDriver driver)
		{
			Set<String> child=driver.getWindowHandles();
			for(String b:child) {
				driver.switchTo().window(b);
			}
		}
		
		public void scrollBar(WebDriver driver,int x,int y)
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy("+x+","+y+")");
			}
		}
	


