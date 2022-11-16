class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int num = x;
        int backwardsnum = 0;
        while (num > 0) {
            backwardsnum = backwardsnum * 10 + num % 10;
            num /= 10;
        }
        return x == backwardsnum;
    }
}
