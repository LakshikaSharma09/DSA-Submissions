class Solution {
    public static void solve(List<String> l,StringBuilder sb,int n,int o,int c){
        if(o==n && c==n){
            l.add(sb.toString());
            return;
        }
        if(o<n){
            sb.append('(');
            solve(l,sb,n,o+1,c);
            sb.deleteCharAt(sb.length()-1);
        }
        if(c<n && c<o){
            sb.append(')');
            solve(l,sb,n,o,c+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> l = new ArrayList<>();
        StringBuilder sb = new StringBuilder("");
        solve(l,sb,n,0,0);
        return l;
    }
}

