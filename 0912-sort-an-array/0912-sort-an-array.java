class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(nums, n, i);
        }

        // Move the max to the end, shrink the heap, repeat
        for (int end = n - 1; end > 0; end--) {
            int temp = nums[0];
            nums[0] = nums[end];
            nums[end] = temp;
            heapify(nums, end, 0);
        }
        return nums;
    }

    private void heapify(int[] a, int size, int i) {
        while (true) {
            int largest = i;
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if (left < size && a[left] > a[largest]) largest = left;
            if (right < size && a[right] > a[largest]) largest = right;

            if (largest == i) break;

            int temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;
            i = largest;
        }
    }
}