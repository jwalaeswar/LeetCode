# 1. Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

**Example 1:**
<pre>
<strong>Input:</strong> nums = [2,7,11,15], target = 9
<strong>Output:</strong> [0,1]
<strong>Explanation:</strong> Because nums[0] + nums[1] == 9, we return [0, 1].
</pre>

**Example 2:**
<pre>
<strong>Input:</strong> nums = [3,2,4], target = 6
<strong>Output:</strong> [1,2]
</pre>
**Example 3:**
<pre>
<strong>Input:</strong> nums = [3,3], target = 6
<strong>Output:</strong> [0,1]
</pre>

**Constraints:**
- `2 <= nums.length <= 104`
- `-109 <= nums[i] <= 109`
- `-109 <= target <= 109`
- **Only one valid answer exists.**

# Solution and Explanation 
- [Java](./Solution.java) 
- [Test](./Tester.java)
## Explanation (Using HashMap)
- Use HashMap for storing element and it's index.
- Then find for target - element value if you found match that means the sum of two numbers is equal to target. 
- Then return the index of both values in an array.

## Solution (Using HashMap)
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

