package scripts;

import org.testng.annotations.Test;

import PomPages.SkillraryDemoPage;
import PomPages.SkillraryPage;
import genericLib.BaseClass;
import genericLib.WebDriverutilities;

public class Testcase1 extends BaseClass{
	
	@Test
	public void tc1()
	{
		SkillraryPage s=new SkillraryPage(driver);
		s.gearsbutton();
		s.Skillrarydemoapplication();
		
	    driverutilities.swicthTabs(driver);
	    SkillraryDemoPage sd=new SkillraryDemoPage(driver);
	}

}
