class Solution {

    public String encode(List<String> strs) {

        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder("");

        for(String item : strs){
            int length = item.length();
            sb.append(length + "#" + item);
        } 
        sb.toString();
        return sb.toString();

    }

    public List<String> decode(String str) {

        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            while(i<str.length() && str.charAt(i)!='#'){
                sb.append(str.charAt(i));
                i++;
            }
            int length = Integer.parseInt(sb.toString());
            sb.setLength(0);
            String s = str.substring(i+1,i+length+1);
            list.add(s);
            i =i+length;
        }
        return list;
    }
}
