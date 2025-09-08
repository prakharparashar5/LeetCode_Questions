class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minlen = Integer.MAX_VALUE;
        int currsum = 0;
        int left = 0;
        for (int i = 0; i < n; i++) {
            currsum += nums[i];
            while (currsum >= target) {
                minlen = Math.min(minlen, i - left + 1);
                currsum -= nums[left];
                left++;
            }
        }
        return minlen == Integer.MAX_VALUE ? 0 : minlen;

    }
}