class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int r=0;
        int l=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(r<s.length && l<g.length){
            if(s[r]>=g[l]){
                r++;
                l++;
            }
           else{
            r++;
           }
        }
        return l;
    }
}