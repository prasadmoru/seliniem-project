package com.hrms.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Global {
	//variable information 
	public WebDriver driver;
	WebElement element;
	Actions action;
	public String url="https://opensource-demo.orangehrmlive.com/";
	public String un="Admin";
	public String pw="admin123";
	public String fname="san";
	public String lname="thosh";
	
	//objects information
	public String txt_lnname="txtUsername";
	public String txt_pwd="txtPassword";
	public String but_login="Submit";
	public String link_logout="Logout";
	public String bt_pim="//*[@id='menu_pim_viewPimModule']/b";
	public String bt_ademp="//*[@id='menu_pim_addEmployee']";
	public String txt_fname="//*[@id='firstName']";
	public String txt_lname="//*[@id='lastName']";

}
