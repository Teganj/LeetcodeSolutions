class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> sets = new HashSet<>();
        for(int val : nums){
            if(sets.contains(val)) return true;
            sets.add(val);
        }
        return false;
    }
}
