class Solution {
    public int maxOperations(int[] nums, int k) {
            Arrays.sort(nums);
            int left=0;
            int right=nums.length-1;
            int count=0;
            while(left < right){
                int sums = nums[left]+nums[right];
                if(sums==k){
                    count++;
                    left++;
                    right--;
                }
                else if(sums<k){
                    left++;
                }
                else {
                    right--;
                }
            }
            return count;
    }
}