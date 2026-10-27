class Solution {
    public int[] sortArrayByParity(int[] nums) {
      int left=0;
      for(int right =nums.length-1;right>left;right--){
        while(left<right && nums[left]%2==0) left++;
        if(nums[right]%2==0){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
        }
      }
      return nums;  
    }
}