class Solution {
    public int atMost(int[] arr, int limit){
        int n=arr.length;
        int currSum=0;
        int l=0;
        int count=0;
        if(limit<0) return 0;

        for(int r=0;r<n;r++){
            currSum+=arr[r];
            while(currSum>limit){
                currSum-=arr[l];
                l++;
            }
            count+=r-l+1;
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums,goal)-atMost(nums,goal-1);
    }
}