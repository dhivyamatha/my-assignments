package com.training;

public class Learnstringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String companyName = "TestLeaf";  
   String data= "Testleaf";
   char[]charArray = data.toCharArray();
   for(int i= charArray.length-1;i>=0;i--) {
	   System.out.println(charArray[i]);
   }
	}

}
