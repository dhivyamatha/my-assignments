package dailyjava;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String str1 = "Amanaplanacanalpanama",reverseStr1 = "";
	int strLength1 = str1.length();
	for (int i = (strLength1-1);i>=0;--i) {
		reverseStr1= reverseStr1+str1.charAt(i);
	}
	if(str1.toLowerCase().equals(reverseStr1.toLowerCase())) {
		System.out.println(str1+" is a Palindrome String.");
	}
	else {
		System.out.println(str1+" is not a palindrome String.");
	}	
	String str2 = "raceacar",reverseStr2 = "";
	int strLength2 = str2.length();
	for (int i = (strLength2-1);i>=0;--i) {
		reverseStr2= reverseStr2+str2.charAt(i);
	}
	if(str2.toLowerCase().equals(reverseStr2.toLowerCase())) {
		System.out.println(str2+" is a Palindrome String.");

	}
	else {
		System.out.println(str2+" is not a palindrome String.");
	
	}	
	String str3 = " ",reverseStr3 = "";
	int strLength3 = str3.length();
	for (int i = (strLength3-1);i>=0;--i) {
		reverseStr3= reverseStr3+str3.charAt(i);
	}
	if(str3.toLowerCase().equals(reverseStr3.toLowerCase())) {
		System.out.println(str3+" is a Palindrome String.");
	}
	else {
		System.out.println(str3+" is not a palindrome String.");
	}	
	
	
	}
	
}
