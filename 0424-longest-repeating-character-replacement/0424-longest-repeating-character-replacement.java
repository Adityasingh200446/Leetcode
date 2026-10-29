class Solution {
    public int characterReplacement(String s, int k) {
        int r=0;
        int l=0;
        int len=0;
        int maxlen=0;
        int replace=0;
        int maxFreq=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(r<s.length()){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);

            maxFreq = Math.max(maxFreq, map.get(s.charAt(r)));
            len=r-l+1;
            replace=len-maxFreq;
            while(replace>k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                if(map.get(s.charAt(l))==0){
                    map.remove(s.charAt(l));
                }
                l++;
                len=r-l+1;
                replace=len-maxFreq;
            }
            maxlen=Math.max(maxlen,len);
            r++;

        }
        return maxlen;
    }
}