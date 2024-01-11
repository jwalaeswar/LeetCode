package Problems.PalindromeNumber;

public class Solution {
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
