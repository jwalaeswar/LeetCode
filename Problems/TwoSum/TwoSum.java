package Problems.TwoSum;
import java.util.*;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                int j = map.get(target - nums[i]);
                int[] arr = {j, i};
                return arr;
            } else {
                map.put(nums[i], i);
            }
        }
        return nums;
    }
}