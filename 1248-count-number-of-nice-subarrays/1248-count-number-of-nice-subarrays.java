class Solution {
    public int atMost(int[] nums,int k){
        if(k<0) return 0;
        int j=0;
        int l=0;
        int count=0;
        int n=nums.length;
        for(int r=0; r<n; r++){
            if(nums[r] % 2!=0){
                j+=1;
            }
            while(j>k){
                if(nums[l]%2!=0){
                    j--;
                }
                l++;
            }
            count+=r-l+1;
        }
        return count;
    }

    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums,k)-atMost(nums,k-1);
    }
}