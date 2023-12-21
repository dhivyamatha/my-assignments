package week1.day1;

import java.util.Arrays;

public class Findmissingelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int[] input = new int[]{1,4,3,2,8,6,7};
		
		Arrays.sort(input);
		
		System.out.println("sort value"+Arrays.toString(input));
		n=8;
		
		int Total = (n*(n+1/2));
		
		int sum = 0;
		
		for(int i : input) {
			sum += i;// sum=sum+i
			System.out.println(sum);
		
		}
		int v= Total-sum;
		System.out.println("The missing numbers is"+v);
		
		
		

	}

}
