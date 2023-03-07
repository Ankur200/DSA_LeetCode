class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
       List<Integer> ans=new ArrayList<>();
       for(int i=0;i<nums.length;i++){
           ans.add(index[i],nums[i]);
       }
       int res[] =new int [nums.length];
       for(int i=0;i<nums.length;i++){
           res[i]=ans.get(i);
       }
       return res;
  }
}
