package week1.day1;

public class Palindromenumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=54321,sum=0,r;
		int temp=n;
		while(n>0) {
			r = n%10;
			sum=(sum*10)+r;
			n=n/10;
			
		}
		if(temp==sum) {
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
			
		}
	}


	

}