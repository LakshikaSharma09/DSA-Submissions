class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder("");

        for(String item : strs){
            sb.append(item +'😂');
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder("");

        for(int i=0;i<str.length();i++){
            int k=i;
            while(str.charAt(i)!='😂'){
                sb.append(str.charAt(i));
                i++;
            }
            list.add(sb.toString());
            sb.setLength(0);
        }
        return list;
    }
}
