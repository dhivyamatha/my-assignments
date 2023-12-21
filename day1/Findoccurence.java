package com.training;

public class Findoccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String data= "Testleaf";
   int count=0;
for(int i=0; i<data.length(); i++) {
	   if(data.charAt(i)=='e') {
		   count++;
	   }
}
	  
System.out.println("Number of 'e' is present:"+count);

}
}