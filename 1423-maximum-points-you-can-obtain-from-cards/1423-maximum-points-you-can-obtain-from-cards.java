class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int curSum=0;
        int n=cardPoints.length;
        for(int i=0;i<k;i++){
            curSum+=cardPoints[i];
        }
        int maxSum=curSum;
        for(int i=1;i<=k;i++){
            curSum-=cardPoints[k-i];
            curSum+=cardPoints[n-i];

            maxSum=Math.max(maxSum,curSum);
        }
        return maxSum;
    }
}