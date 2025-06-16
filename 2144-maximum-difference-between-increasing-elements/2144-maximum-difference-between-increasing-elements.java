class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int MaxDiff = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] < nums[j]) {

                    MaxDiff = Math.max(MaxDiff, (nums[j] - nums[i]));
                }
            }

        }
        return MaxDiff;
    }

}