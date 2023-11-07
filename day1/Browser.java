package week1.day1;

public class Browser {

		// TODO Auto-generated method stub
 public String launchBrowser(String browsername) {
	 System.out.println("Browser launched successfully");
	 return browsername;
	 
 }
private void loadurl() {
	System.out.println("Applicationurl loaded successfully");
	
}
public static void main(String[] args) {
	Browser b2 = new Browser();
	String browser = b2.launchBrowser("firefox");
	System.out.println(browser);
	b2.loadurl();
	}

}
