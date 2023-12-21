package dailyjava;

public class Majorele {


		
		    public int findMajorEle(int inputArr[])  
		    {  
		        int s = inputArr.length;  
		          
		        int count = 0;  
		          
		        for(int i = 0 ; i < s; i++)  
		        {  
		           
		            for(int j = 0; j < s; j++)  
		            {  
		                if(inputArr[i] == inputArr[j])  
		                {  
		                    count = count + 1;  
		                }  
		            }  
		              
		            if(count > s / 2)  
		            {  
		                return inputArr[i];  
		            }  
		              
		   
		            count = 0;  
		        }  
		          
		     
		        return -1;  
		    }  
		  
		
		    public static void main(String[] argvs)   
		    {  
		  
		        Majorele obj = new Majorele();  
		 
		        int arr[] = {3,2,3};  
		          
		        int s = arr.length;  
		        System.out.println("For the input array.");  
		        for(int i = 0; i < s; i++)  
		        {  
		            System.out.print(arr[i] + " ");  
		        }  
		        System.out.println();  
		        int ans = obj.findMajorEle(arr);  
		        if(ans != -1)  
		        {  
		           System.out.println("The majority element is: " + ans);   
		        }  
		        else  
		        {  
		            System.out.println("The majority element is not found.");   
		        }  
		          
		          
		        System.out.println("\n");  
		          
		        // another input array  
		        int arr1[] = {2,2,1,1,1,2,2};  
		          
		        s = arr1.length;  
		        System.out.println("For the input array.");  
		        for(int i = 0; i < s; i++)  
		        {  
		            System.out.print(arr1[i] + " ");  
		        }  
		        System.out.println();  
		        ans = obj.findMajorEle(arr1);  
		        if(ans != -1)  
		        {  
		           System.out.println("The majority element is: " + ans);   
		        }  
		        else  
		        {  
		            System.out.println("The majority element is not found.");   
		        }  
		          
		          
		    }  
		  
		}  
	


