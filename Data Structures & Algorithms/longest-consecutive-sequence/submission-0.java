class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> hs = new HashSet<>();
        int ans = 0;

        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }

        for(int i=0;i<nums.length;i++){
            if(!hs.contains(nums[i]-1)){
                int count=0;
                int j=nums[i];
                while(hs.contains(j)){
                    count++;
                    ans = Math.max(ans, count);
                    j++;
                }
            }
        }
        return ans;
    }
}
