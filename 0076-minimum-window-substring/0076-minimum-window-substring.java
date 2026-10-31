class Solution {
    public String minWindow(String s, String t) {
        int r=0;
        int l=0;
        int cnt=0;
        int minlen=Integer.MAX_VALUE;
        int start=0;
        HashMap<Character,Integer> map =new HashMap<>();
        if(t.length()>s.length()) return "";
        for(int i=0;i<t.length();i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        while(r<s.length()){
            char ch=s.charAt(r);
            if(map.containsKey(ch)){
                if(map.get(ch)>0){
                    cnt++;
                }
                map.put(ch,map.get(ch)-1);
            }
            while(cnt==t.length()){
                if(r-l+1<minlen){
                    minlen=r-l+1;
                    start=l;
                }
                char left=s.charAt(l);
                if(map.containsKey(left)){
                    map.put(left,map.get(left)+1);
                    if(map.get(left)>0){
                        cnt--;
                    }
                }
                l++;
            }
            r++;
        }
        if(minlen==Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start,start+minlen);
    }
}