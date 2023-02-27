class Solution {
    public int numIdenticalPairs(int[] nums) {
        int size =nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<size;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        int ans=0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                ans+=((entry.getValue())*(entry.getValue()-1))/2;
            }
            else{
                continue;
            }
        }
        return ans;
    }
}
