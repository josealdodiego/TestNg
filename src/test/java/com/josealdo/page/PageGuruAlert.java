package com.josealdo.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.josealdo.core.CorePage;

public class PageGuruAlert  extends  CorePage<PageGuruAlert>{
	
	
	@FindBy (name ="cusid")
	private WebElement inputName;
	
	@FindBy (name ="submit")
	private WebElement btnSubmit;
	
	
	
	public void verifiqueAlert(String id) {
		preencherCampo(inputName, id);
		click(btnSubmit);
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		
		
			
	}
	
	
	
	
	
	
	
}
