package com.josealdo.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.josealdo.core.CorePage;
import com.josealdo.driver.TLDriverFactory;

public class PageGoogle extends CorePage<PageGoogle>{

	
	public PageGoogle() {
		this.driver = TLDriverFactory.getDriver();
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(name = "q")
	private WebElement inputTextSearch;
	
	@FindBy(name = "btnK")
	private WebElement bntSearch;
	
	
	public PageGoogle buscarNoGoogle(String busca) {
		aguardarElementoVisivel(inputTextSearch);
		preencherCampo(inputTextSearch,busca);
		inputTextSearch.submit();
		return this;
	}
	
}
