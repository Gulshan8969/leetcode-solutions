class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);                                   // first element

            if (i > 0) {
                List<Integer> prev = ans.get(i - 1);
                for (int j = 1; j < i; j++) {
                    row.add(prev.get(j - 1) + prev.get(j)); // middle elements
                }
                row.add(1);                               // last element
            }

            ans.add(row);
        }
        return ans;
    }
}