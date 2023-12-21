package com.training;

public class Polymorphismoverriding {

	public void openIncognito() {
		System.out.println("Opened in Incognito");
	}
	public void ClearCache() {
		System.out.println("Cache Cleared");
	}
	public void openURL() {
		System.out.println("URL Opened in chrome");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Chrome c= new Chrome();
   c.openincognito();
   c.clearCache();
  System.out.println(c.BrowserName);
  System.out.println(c.BrowserVersion);
   
	}

}
