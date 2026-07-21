class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int p1=0;
        int p2=n-1;
        if(n==1){
            return nums[0];
        }
        if(n==2){
            return Math.min(nums[0],nums[1]);
        }

        while(p1<p2){
            int mid = p1+ (p2-p1)/2;
            if(nums[(mid-1+n)%n]>nums[mid]){
                return nums[mid];
            }else if(nums[mid]>nums[p2]){
                p1=mid+1;
            }else{
                p2=mid;
            }
        }
        return nums[p1];
    }
}
