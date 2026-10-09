class Solution {
    public static void solve(List<List<Integer>> l,List<Integer> cl,int nums[],int i){
        l.add(new ArrayList<>(cl));
        for(int j=i;j<nums.length;j++){
            if(j>i && nums[j]==nums[j-1]){
                continue;
            }
            cl.add(nums[j]);
            solve(l,cl,nums,j+1);
            cl.remove(cl.size()-1);
        }

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> cl = new ArrayList<>();
        Arrays.sort(nums);
        solve(l,cl,nums,0);
        return l;   
    }
}
