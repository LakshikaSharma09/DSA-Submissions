class Solution {

    public static void solve(List<String> l,StringBuilder sb,HashMap<Character,String> hm,String digits,int i){
        if(sb.length()==digits.length()){
            l.add(sb.toString());
            return;
        }
        String x = hm.get(digits.charAt(i));
        for(int k=0;k<x.length();k++){
            sb.append(x.charAt(k));
            solve(l,sb,hm,digits,i+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public List<String> letterCombinations(String digits) {

        List<String> l = new ArrayList<>();
        if(digits.length()==0){
            return l;
        }
        StringBuilder sb = new StringBuilder("");
        HashMap<Character,String> hm = new HashMap<>();

        hm.put('2',"abc");
        hm.put('3',"def");
        hm.put('4',"ghi");
        hm.put('5',"jkl");
        hm.put('6',"mno");
        hm.put('7',"pqrs");
        hm.put('8',"tuv");
        hm.put('9',"wxyz");

        solve(l,sb,hm,digits,0);
        return l;
    }
}
