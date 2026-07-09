class Solution {
    public int maxArea(int[] heights) {
        int ans=-1;
        int i=0;
        int j=heights.length-1;

        while(i<j){
            int minh= Math.min(heights[i],heights[j]);
            int width=j-i;
            ans=Math.max(ans,minh*width);
            if(heights[i]>heights[j]){
                j--;
            }else{
                i++;
            }
        }
        return ans;
    }
}
