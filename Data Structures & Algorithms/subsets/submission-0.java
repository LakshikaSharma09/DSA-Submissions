class Solution {
    public void helper(List<List<Integer>> l1,int nums[], int i,List<Integer> l2){
        if(i>=nums.length){
            l1.add(new ArrayList<>(l2));
            return;
        }
        helper(l1,nums,i+1,l2);
        l2.add(nums[i]);
        helper(l1,nums,i+1,l2);
        l2.remove(l2.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        helper(l1,nums,0,l2);
        return l1;
    }
}
