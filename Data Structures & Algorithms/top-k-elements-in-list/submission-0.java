class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int ans[] = new int[k];

        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b)->a[0]-b[0]);

        for(Map.Entry<Integer,Integer> x: hm.entrySet()){
            heap.offer(new int[]{x.getValue(),x.getKey()});
            if(heap.size()>k){
                heap.poll();
            }
        }
        for(int i=0;i<k;i++){
            ans[i]=heap.poll()[1];
        }
        return ans;
    }
}
