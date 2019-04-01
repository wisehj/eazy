package twosum;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>map=new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int c=target-nums[i];
			if(map.containsKey(c)) {
				return new int[] {i,map.get(c)};
			}
			map.put(nums[i], i);
			
		
		}
  
		 throw new IllegalArgumentException("No two sum solution");}
    }
