package PomPages;

import org.openqa.selenium.support.PageFactory;

public class SkillraryPage {
	@FindBy()
	private WebElelement gearsbtn;
	
	@FindBy
	private WebElement skillrarydemoapp;
	
	public SkillraryPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void gearsbutton() {
		gearsbtn.click();
	}
	public void Skillrarydemoapplication() {
		Skillrarydemoapp.click();
	}

}
