class Solution {
    public int characterReplacement(String s, int k) {
        int count=0;
        int left=0;
        int max=0;

        int arr[] = new int[26];

        for(int i=0;i<s.length();i++){

            arr[s.charAt(i)-'A']++;
            max = Math.max(max, arr[s.charAt(i)-'A']);

            while((i-left+1)-max > k){
                arr[s.charAt(left)-'A']--;
                left++;
            }
            count = Math.max(count, i-left+1);
        }
        return count;
    }
}
