package dailyjava;

		import java.util.*;
//find single occurence in an array
		public class Main {
		public static void main(String[] args) {
			List<Integer> arr1 = new ArrayList<>(Arrays.asList(2,2,1));
			int x = 0;
			for (int i : arr1) {
			if (Collections.frequency(arr1, i) == 1) {
				x = i;
				break;
			}
			}
			System.out.println("The element with single occurrence is " + x);
			
			List<Integer> arr2 = new ArrayList<>(Arrays.asList(4,1,2,1,2));
			int y = 0;
			for (int i : arr2) {
			if (Collections.frequency(arr2, i) == 1) {
				y = i;
				break;
			}
			}
			System.out.println("The element with single occurrence is " + y);	
			
			List<Integer> arr3 = new ArrayList<>(Arrays.asList(1));
			int z = 0;
			for (int i : arr3) {
			if (Collections.frequency(arr3, i) == 1) {
				z= i;
				break;
			}
			}
			System.out.println("The element with single occurrence is " + z);
			
			
		}
		

	}


