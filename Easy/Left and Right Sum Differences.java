class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int n=nums.length;
        int [] ans=new int[n];
        int rightSum=0;
        for(int i: nums){
            rightSum+=i;
        }
        int leftSum=0;
        for(int i=0;i<n;i++){
            rightSum-=nums[i];
            ans[i]=Math.abs(leftSum-rightSum);
            leftSum+=nums[i];
        }
        return ans;
    }
}