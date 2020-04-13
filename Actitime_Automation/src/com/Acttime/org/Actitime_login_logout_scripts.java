package com.Acttime.org;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Actitime_login_logout_scripts extends Actitime_login_logout {
	
	public Actitime_Objects actitime_object;
	@BeforeTest
	public void intialization(){
		actitime_object=PageFactory.initElements(driver, Actitime_Objects.class);
			
	}
	@Test
	public void login_logout(){
		initbrowser();
		project_url("http://localhost/login.do");
		enter_text(actitime_object.actitime_username,"admin" );
		enter_text(actitime_object.actitime_password,"manager" );
		click_on_element(actitime_object.actitime_login);
		
	}

	}
	


