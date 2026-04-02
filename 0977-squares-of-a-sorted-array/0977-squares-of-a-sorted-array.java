class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] arr = new int[nums.length];
        int left = 0 , right = n-1 , index = n-1;
        while(left <= right){
            int leftsquare = nums[left] * nums[left];
            int rightsquare = nums[right] * nums[right];

            if(leftsquare < rightsquare){
                arr[index] = rightsquare;
                right--;
            }else{
                arr[index] = leftsquare;
                left++;
            }
            index--;
        }
        
        return arr;
    }
}


