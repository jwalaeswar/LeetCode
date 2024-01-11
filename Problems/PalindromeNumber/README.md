# 9. Palindrome Number

Given an integer `x`, return `true` if `x` is a palindrome, and `false` otherwise.

**Example 1:**

<pre>
<strong>Input:</strong> x = 121
<strong>Output:</strong> true
<strong>Explanation:</strong> 121 reads as 121 from left to right and from right to left.
</pre>
**Example 2:**
<pre>
<strong>Input:</strong> x = -121
<strong>Output:</strong> false
<strong>Explanation:</strong> From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
</pre>
**Example 3:**
<pre>
<strong>Input:</strong> x = 10
<strong>Output:</strong> false
<strong>Explanation:</strong> Reads 01 from right to left. Therefore it is not a palindrome.
</pre>

**Constraints:**
- -2<sup>31</sup> <= x <= 2<sup>31</sup> - 1

# Solution and Explanation
## Solution
- First revers the Integer using recusrsive method.
- Now check whether both the intergers are same or not, hence palindrome.

```
class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        if(x%10 == 0 && x != 0) return false;
        int rev = reverse(x);
        if(rev == x) return true;
        return false;
    }
    private int reverse(int n){
        int ret = 0;
        while( n > 0){
            ret = ret*10 + n%10;
            n /= 10;
        }
        return ret;
    }
}
```
