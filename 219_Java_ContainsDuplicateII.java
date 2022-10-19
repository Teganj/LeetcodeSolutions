class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums==null || nums.length<2 || k==0) return false;
        
        int i=0;
        HashSet<Integer> number_set = new HashSet<Integer>();
        
        for(int a=0; a<nums.length; a++){
            if(!number_set.add(nums[a])){
                return true;
            }
            
            if(number_set.size()>=k+1){
                number_set.remove(nums[i++]);
            }
        }
        return false;
    }
}
