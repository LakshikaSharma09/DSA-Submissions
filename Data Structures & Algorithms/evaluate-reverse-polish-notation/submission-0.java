class Solution {
    public int evalRPN(String[] tokens) {
        int n=tokens.length;
        Stack<String> st = new Stack<>();
        for(int i=0;i<n;i++){
            if(tokens[i].equals("+") ||tokens[i].equals("-") ||tokens[i].equals("*") ||tokens[i].equals("/") ){
                int s1 = Integer.parseInt(st.pop());
                int s2 = Integer.parseInt(st.pop());
                int ans = 0;

                if (tokens[i].equals("+"))
                    ans = s2 + s1;
                else if (tokens[i].equals("-"))
                    ans = s2 - s1;
                else if (tokens[i].equals("*"))
                    ans = s2 * s1;
                else
                    ans = s2 / s1;

                st.push(String.valueOf(ans));

            }else{
                st.push(tokens[i]);
            }
        }
        return Integer.parseInt(st.peek());
    }
}
