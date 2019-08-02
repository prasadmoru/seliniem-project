package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class General extends Global {
	public void open() {
	System.setProperty("webdriver.chrome.driver", "./HDrivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.navigate().to(url);
	if(driver.getTitle().equals("OrangeHRM"))
		System.out.println("test case is pass" );
		else
			System.out.println("test case is fail");
	
	}
public void close(){
	driver.close();
	if(driver.getTitle().equals("OrangeHRM"))      //driver is closed so error
	System.out.println("test case is fail" );
	else
		System.out.println("test case is pass");
}
public void login()throws Exception{
	driver.findElement(By.name(txt_lnname)).sendKeys(un);
	driver.findElement(By.name(txt_pwd)).sendKeys(pw);
	driver.findElement(By.name(but_login)).click();
	Thread.sleep(5000);
	if(driver.getTitle().equals("OrangeHRM"))
		System.out.println("test case is pass" );
		else
			System.out.println("test case is fail");
	}
public void logout()throws Exception{
	element=driver.findElement(By.id("welcome"));
    action=new Actions(driver);
	action.moveToElement(element).click().perform();
	Thread.sleep(4000);
	driver.findElement(By.linkText(link_logout));
	if(driver.getTitle().equals("OrangeHRM"))
		System.out.println("test case is pass" );
		else
			System.out.println("test case is fail");
    }
public void addemp() throws Exception{
	element=driver.findElement(By.xpath(bt_pim));
	Actions action=new Actions(driver);
	action.moveToElement(element).click().perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath(bt_ademp)).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath(txt_fname)).sendKeys("san");
	Thread.sleep(5000);
	driver.findElement(By.xpath(txt_lname)).sendKeys("thosh");
	Thread.sleep(5000);
	System.out.println("adding new employee");
    }
public void delemp(){
	System.out.println("deleted employee");
    }
}
