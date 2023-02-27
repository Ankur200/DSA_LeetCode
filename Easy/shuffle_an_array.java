class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] ans=new int[nums.length];
        int x=0;
        for(int i=0;i<n;i++){
            ans[x]=nums[i];
            x+=2;
        }
         x=1;
        for(int i=n;i<nums.length;i++){
            ans[x]=nums[i];
            x+=2;
        }
        return ans;
    }
}
