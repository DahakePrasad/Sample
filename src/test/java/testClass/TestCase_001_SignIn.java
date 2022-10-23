package testClass;

import org.openqa.selenium.support.PageFactory;

import com.Pages.CreateAccountPage3;
import com.Pages.MainPage1;
import com.Pages.SignInPage2;
import com.Utility.BaseClass;

public class TestCase_001_SignIn extends BaseClass{
	
	public void signIn()
	{
		MainPage1 mp=PageFactory.initElements(driver, MainPage1.class);
		SignInPage2 sp=PageFactory.initElements(driver, SignInPage2.class);
		CreateAccountPage3 cap=PageFactory.initElements(driver, CreateAccountPage3.class);
		
		com.Utility.Library.click(mp.getRegister());
		com.Utility.Library.click(sp.getCreateAccount());
		com.Utility.Library.sendKeys(cap.getEmail(), com.Utility.ExcelDataProvider.excelDataProvider("Sheet1", 0, 1));
		com.Utility.Library.sendKeys(cap.getPassword(), com.Utility.ExcelDataProvider.excelDataProvider("Sheet1", 1, 1));
		com.Utility.Library.sendKeys(cap.getConfirmPassword(), com.Utility.ExcelDataProvider.excelDataProvider("Sheet1", 1, 1));
		com.Utility.Library.click(cap.getCreateAccount());
		com.Utility.Library.screenShot("AfterCreatingAccount");
		
		
	}

}
