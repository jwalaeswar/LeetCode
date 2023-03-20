- Use HashMap for storing element and it's index.
- Then find for target - element value if you found match that means the sum of two numbers is equal to target. 
- Then return the index of both values in an array.

```
class Solution {
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
```
