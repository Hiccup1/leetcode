class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] a = new int[200];
        int len = s.length();
        int max1 = 0;
        int index = 0;
        for(int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            index = Math.max(a[ch], index);
            a[ch] = i + 1;
            max1 = Math.max(max1, i - index + 1);
        }
        return max1;
    }
}
