class Solution {
    public int singleNumber(int[] nums) {
        int list = nums[0];
        for(int i=1; i<nums.length; i++){
            list = list^nums[i];
        }
        return list;
    }
}
