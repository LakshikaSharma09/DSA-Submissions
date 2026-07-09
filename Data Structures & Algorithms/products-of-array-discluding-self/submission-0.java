class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int arr[] = new int[n];
        int arr2[] = new int[n];
        
        arr[0] = 1;
        arr2[n-1] = 1;

        for(int i=1;i<n;i++){
            arr[i] = arr[i-1] * nums[i-1];
        }

        for(int j=n-2;j>=0;j--){
            arr2[j]=arr2[j+1]*nums[j+1];
        }

        for(int i=0;i<n;i++){
            arr[i]=arr[i]*arr2[i];
        }
        return arr;
    }
}  
