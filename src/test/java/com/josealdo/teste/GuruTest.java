package com.josealdo.teste;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.josealdo.core.InvokedMethodListener;
import com.josealdo.page.PageGuruHome;
 
@Listeners(InvokedMethodListener.class)
	public class GuruTest{
	 
	    @Test
    public void loginSucesso() throws Exception {
    	new PageGuruHome()
    	.openPage(PageGuruHome.class, "http://demo.guru99.com/test/login.html")
    	.acessarLoginGuru("josealdodiego@gmail.com", "12345")
    	.validarAcessoOK();
    	
    	
    	
    }
}