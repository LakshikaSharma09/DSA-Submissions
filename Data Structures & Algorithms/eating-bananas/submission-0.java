class Solution {
    public int helper(int piles[], int k){
        int p = 0;
        for(int i=0;i<piles.length;i++){
           p += Math.ceil((double)piles[i]/k);
        }
        return p;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int r = Integer.MIN_VALUE;
        int l = 1;

        for(int i=0;i<piles.length;i++){
            r = Math.max(piles[i],r);
        }

        while(l<=r){
            int mid = l+(r-l)/2;
            int hrs = helper(piles,mid);

            if(hrs<=h){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}
