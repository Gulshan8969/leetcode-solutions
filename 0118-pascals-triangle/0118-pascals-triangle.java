class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        // Row 1
        List<Integer> first = new ArrayList<>();
        first.add(1);
        ans.add(first);
        if (numRows == 1) return ans;

        // Row 2
        List<Integer> second = new ArrayList<>();
        second.add(1);
        second.add(1);
        ans.add(second);
        if (numRows == 2) return ans;

        // Row 3 se numRows tak
        for (int row = 3; row <= numRows; row++) {
            List<Integer> prev = ans.get(row - 2);
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for (int i = 1; i < row - 1; i++) {
                curr.add(prev.get(i - 1) + prev.get(i));
            }
            curr.add(1);
            ans.add(curr);
        }

        return ans;
    }
}