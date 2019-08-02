package com.hrms.testscripts;
import com.hrms.lib.General;

public class Tc_201 /*extends General */{

	public static void main(String[] args) throws Exception {
    	//General g=new Tc_201();
		General g=new General();
	g.open();
	g.login();
	g.logout();
	g.close();
 
	}
	
} 
