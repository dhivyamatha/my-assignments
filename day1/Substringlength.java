package com.training;

public class Substringlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s= "Hello world";
String t=s.replaceAll("\\s", "");
System.out.println(t);
String substring1=t.substring(5);
System.out.println("the last word is world with length:"+substring1.length());


String s2= "fly me to the moon";
String f=s2.replaceAll("\\s", "");
System.out.println(f);
String substring2=f.substring(10);
System.out.println("the last word is moon with length:"+substring2.length());


String s3= "luffy is still joyboy";
String l=s3.replaceAll("\\s", "");
System.out.println(l);
String substring3=l.substring(12);
System.out.println("the last word is joyboy with length:"+substring3.length());
























	}

}
