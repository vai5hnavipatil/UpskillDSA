import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> sum = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int com = target - nums[i];
            if(sum.containsKey(com))
            {
                return new int[] {sum.get(com),i};
            }
            sum.put(nums[i],i);
        }
return new int[] {};
    }
}