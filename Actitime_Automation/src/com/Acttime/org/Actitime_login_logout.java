package com.Acttime.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actitime_login_logout {
	public WebDriver driver;
	public void initbrowser(){
		driver=new FirefoxDriver();
	}
	public void project_url(String url){
		driver.get(url);
		
	}
	public void enter_text(WebElement obj,String text){
		//System.out.println("object ="+obj);
		//obj.clear();
		obj.sendKeys(text);
		
	}
	public void click_on_element(WebElement obj1){
		obj1.click();
		
	}

}
