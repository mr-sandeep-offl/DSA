class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++){
            for (int j=1;j<n;j++){
                int sum=nums[i]+nums[j];

                if(sum==target){
                    return new int[]{i,j};
                }
                
            }
        }
    }
}