class Solution {

    public boolean isAnagram(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list1= new ArrayList<>();
        int arr[] = new int[1001];

        for(int i=0;i<strs.length;i++){
            if(arr[i]!=0){
                continue;
            }
            List<String> list2 = new ArrayList<>();

            list2.add(strs[i]);

            int j=i+1;
            while(j<strs.length){
                if(arr[j]!=0){
                    j++;
                    continue;
                }
                boolean isAnagram = isAnagram(strs[i], strs[j]);
                if(isAnagram){
                    arr[j]++;
                    list2.add(strs[j]);
                }
                j++;
            }
            list1.add(list2);
        }
        return list1;
    }
}
