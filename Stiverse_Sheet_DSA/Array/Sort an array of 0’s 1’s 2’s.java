Q.Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]


Link=https://leetcode.com/problems/sort-colors/description/


                                                                        Code
  class Solution {
    public static void swap(int [] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void sortColors(int[] nums) {
        int i=0,j=0,k=nums.length-1;
        if(nums.length<1)return ;
        while(i<=k){
            if(nums[i]==0) {
                swap(nums,i,j);
                i++;
                j++;
            }
            else if(nums[i]==1){
                i++;
                
            }else{
                swap(nums,i,k);
                
                k--;
            }
        }
    }
}                                                                      
