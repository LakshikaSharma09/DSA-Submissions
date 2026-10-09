class Solution {
    public static void solve(int[] candidates,List<List<Integer>> l,List<Integer> cl, int target,int i,int sum){
        if(sum>=target || i==candidates.length){
            if(sum==target){
                l.add(new ArrayList<>(cl));
            }
        return;
    }
    for(int j=i;j<candidates.length;j++){
        if(j>i && candidates[j]==candidates[j-1]){
            continue;
        }
    cl.add(candidates[j]);
    solve(candidates,l,cl,target,j+1,sum+candidates[j]);
    cl.remove(cl.size()-1);
    }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> cl = new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates,l,cl,target,0,0);
        return l;
    }
}
