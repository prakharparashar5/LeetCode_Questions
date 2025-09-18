class Solution {
    public int maximumGap(int[] nums) {
        if (nums.length < 2) return 0;
        Arrays.sort(nums);
        int gap = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - 1; i++) {
            gap = Math.max(gap, Math.abs(nums[i] - nums[i + 1]));

        }
        return gap;

    }
}