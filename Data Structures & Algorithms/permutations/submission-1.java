class Solution {
    public static void swap(int nums[],int i,int idx){
        int temp = nums[i];
        nums[i] = nums[idx];
        nums[idx] = temp;
    }
    public static void solve(List<List<Integer>> l,int nums[],int idx){
        if(idx==nums.length){
            List<Integer> cl = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                cl.add(nums[i]);
            }
            l.add(cl);
            return;
        }
        for(int i=idx;i<nums.length;i++){
            swap(nums,i,idx);
            solve(l,nums,idx+1);
            swap(nums,i,idx);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        
        solve(l,nums,0);

        return l;

    }
}
