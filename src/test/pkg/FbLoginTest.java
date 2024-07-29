package test.pkg;

import org.testng.annotations.Test;

import base.pkg.BaseClass;
import page.pkg.FbLoginPage;
import utilities.pkg.ExcelUtils;

public class FbLoginTest extends BaseClass {
	
	@Test
	public void verifyLoginWithValidCred() throws InterruptedException {
		FbLoginPage pl = new FbLoginPage(driver);
		
		//Reading the data from excel file by the specified path
		String xl = "C:\\Users\\HP\\Documents\\Book1poi.xlsx";
		String sheet = "Sheet1";
		int rowCount = ExcelUtils.getRowCount(xl, sheet);
		System.out.println(rowCount);
		
		for(int i=0;i<=rowCount;i++) {
			String UserName = ExcelUtils.getCellValue(xl, sheet, i,0);
			System.out.println("UserName = "+UserName);
			String pwd = ExcelUtils.getCellValue(xl, sheet,i,1);
			System.out.println("password = "+pwd);
			Thread.sleep(10000);
			
			//Passing username and password as parameters
			pl.setValues(UserName, pwd);
			
			//Submitting the data by clicking on login button
			pl.clickLoginBtn();
			
			
	}
		driver.navigate().back();		
	}

}
