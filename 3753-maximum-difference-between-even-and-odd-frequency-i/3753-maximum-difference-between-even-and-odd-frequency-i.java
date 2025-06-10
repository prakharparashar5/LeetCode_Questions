class Solution {
    public int maxDifference(String s) {
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        int mineven = 1000;
        int maxodd = 0;

        for (int i = 0; i < 26; i++) {
            if (arr[i] % 2 == 0 && arr[i] > 0) {
                mineven = Math.min(mineven, arr[i]);
            }
            if (arr[i] % 2 != 0) {
                maxodd = Math.max(maxodd, arr[i]);
            }
        }

        return maxodd - mineven;
    }
}