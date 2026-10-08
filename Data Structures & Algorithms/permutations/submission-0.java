class Solution {
    public static void helper(List<List<Integer>> l,List<Integer> cl,HashSet<Integer> hs,int nums[]){

        if(cl.size()==nums.length){
            l.add(new ArrayList<>(cl));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
                cl.add(nums[i]);
            helper(l,cl,hs,nums);
            hs.remove(nums[i]);
            cl.remove(cl.size()-1);
                        }

        }

    }
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> l = new ArrayList<>();
        List<Integer> cl = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();

        helper(l,cl,hs,nums);

        return l;
    }
}
