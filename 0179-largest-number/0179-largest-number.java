import java.util.*;

class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = String.valueOf(nums[i]);
        }

        // a comes before b if a+b is bigger than b+a
        Arrays.sort(strs, (a, b) -> (b + a).compareTo(a + b));

        // if the biggest is "0", every number is 0
        if (strs[0].equals("0")) return "0";

        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s);
        }
        return sb.toString();
    }
}