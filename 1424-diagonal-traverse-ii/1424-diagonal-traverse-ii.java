class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        HashMap<Integer, List<Integer>> hp = new HashMap<>();
        int total = 0, maxDia = 0;

        for (int i = nums.size() - 1; i >= 0; i--) {
            for (int j = 0; j < nums.get(i).size(); j++) {
                int dia = i + j;
                hp.computeIfAbsent(dia, k -> new ArrayList<>()).add(nums.get(i).get(j));
                maxDia = Math.max(maxDia, dia);
                total++;
            }
        }

        int[] result = new int[total];
        int idx = 0;
        for (int d = 0; d <= maxDia; d++) {
            for (int val : hp.get(d)) result[idx++] = val;
        }
        return result;
    }
}