class Solution{
    static void subsums(ArrayList<Integer> arr,int idx,int sum,int N,ArrayList<Integer> ans){
        if(idx==N){
            ans.add(sum);
            return;
        }
        subsums(arr,idx+1,sum+arr.get(idx),N,ans);
        subsums(arr,idx+1,sum,N,ans);
    }
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        subsums(arr,0,0,N,ans);
        return ans;
    }
}
