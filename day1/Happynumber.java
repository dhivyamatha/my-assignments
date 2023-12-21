package dailyjava;

public class Happynumber {

		public static int isHappyNumber(int num){  
	        int rem = 0, sum = 0;  
	          
	        //Calculates the sum of squares of digits  
	        while(num > 0){  
	            rem = num%10;  
	            sum = sum + (rem*rem);  
	            num = num/10;  
	        }  
	        return sum;  
	    }  
	      
	    public static void main(String[] args) {  
	    	int num1= 19;  
	        int result1 = num1;  
	          
	        while(result1 != 1 && result1 != 4){  
	            result1= isHappyNumber(result1);  
	        }  
	          
	        //Happy number always ends with 1  
	        if(result1 == 1)  
	            System.out.println(num1 + " is a happy number");  
	        //Unhappy number ends in a cycle of repeating numbers which contains 4  
	        else if(result1 == 4)  
	            System.out.println(num1 + " is not a happy number");

	    	
	    	
	    	
	    	
	    	int num2= 2;  
	        int result2 = num2;  
	          
	        while(result2 != 1 && result2 != 4){  
	            result2 = isHappyNumber(result2);  
	        }  
	          
	        //Happy number always ends with 1  
	        if(result2 == 1)  
	            System.out.println(num2 + " is a happy number");  
	        //Unhappy number ends in a cycle of repeating numbers which contains 4  
	        else if(result2 == 4)  
	            System.out.println(num2 + " is not a happy number");

	    	
	    	
	    	
	    	
	    	
	    }   
	}


