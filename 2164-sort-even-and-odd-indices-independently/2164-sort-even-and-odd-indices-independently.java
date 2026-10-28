class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> evenIdx = new ArrayList<>();
        ArrayList<Integer> oddIdx = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenIdx.add(nums[i]);
            } else {
                oddIdx.add(nums[i]);
            }
        }

        Collections.sort(evenIdx);                              // ascending
        Collections.sort(oddIdx, Collections.reverseOrder());   // descending

        int e = 0;
        int o = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                nums[i] = evenIdx.get(e++);
            } else {
                nums[i] = oddIdx.get(o++);
            }
        }
        return nums;
    }
}