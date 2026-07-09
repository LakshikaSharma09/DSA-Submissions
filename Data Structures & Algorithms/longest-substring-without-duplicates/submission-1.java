class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count=0;
        int left=0;
        HashMap<Character, Integer> hm =new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                left = Math.max(left,hm.get(s.charAt(i))+1);
            }
            hm.put(s.charAt(i),i);
            count = Math.max(count,i-left+1);
        }
        return count;
    }
}
