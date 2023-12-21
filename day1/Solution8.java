package dailyjava;

import java.util.HashMap;
import java.util.Map;

public class Solution8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class Solution8 {
		    public boolean containsNearbyDuplicate(int[1,2,3,1] nums, int k) {
		        Map<Integer, Integer> d = new HashMap<>();
		        for (int i = 0; i < nums.length; ++i) {
		            if (i - d.getOrDefault(nums[i], -1000000) <= k) {
		                return true;
		            }
		            d.put(nums[i], i);
		        }
		        return false;
		    }
		}

	}

}
