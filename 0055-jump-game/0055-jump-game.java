class Solution {
    public boolean canJump(int[] nums) {
        int l=0;
        int maxreach=0;
        while(l<nums.length){
            if(l>maxreach) return false;
            maxreach = Math.max(maxreach,nums[l]+l);
            if(maxreach>=nums.length-1) return true;
            l++;
        }
        return true;
    }
}