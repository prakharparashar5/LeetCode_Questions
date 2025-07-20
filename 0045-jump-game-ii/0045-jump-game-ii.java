class Solution {
    public int jump(int[] nums) {
        int current = 0 , end = 0 , farthest = 0;
        for(int i= 0 ; i<nums.length -1 ; i++){
            farthest = Math.max(farthest , i+nums[i]);
            if(i == current){
                end++;
                current = farthest;
            }
        }
        return end;
    }
}