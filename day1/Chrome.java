package com.training;

import org.openqa.selenium.devtools.v115.browser.Browser;

public class Chrome extends Browser {

public static final char[] BrowserName = null;
public static final char[] BrowserVersion = null;
public void openincognito() {

	System.out.println("open incognito");

}
public void clearCache() {
	System.out.println("clear");
	
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("single inheritance:");
Chrome c = new Chrome();
c.openURL();
c.closebrowser();
c.navigateback();
c.openincognito();
c.clearCache();

	}
private void openURL() {
	// TODO Auto-generated method stub
	System.out.println("open URL");
}
private void closeBrowser() {
	// TODO Auto-generated method stub
	System.out.println("CloseBrowser");	
}
private void navigateback() {
	// TODO Auto-generated method stub
	System.out.println("Navigateback");
}
private void closebrowser() {
	// TODO Auto-generated method stub
	System.out.println("clear");
}

}
