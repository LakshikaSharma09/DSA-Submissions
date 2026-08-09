class Solution {
    public void solve(int[] nums, int target,List<List<Integer>> l1,List<Integer> l2,int i,int sum){
        if(sum>=target){
            if(sum==target){
                l1.add(new ArrayList<>(l2));
            }
            return;
        }
        if(i>=nums.length){
            return;
        }
        solve(nums,target,l1,l2,i+1,sum);
        sum+=nums[i];
        l2.add(nums[i]);
        solve(nums,target,l1,l2,i,sum);
        l2.remove(l2.size()-1);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        solve(nums,target,l1,l2,0,0);
        return l1;
    }
}
