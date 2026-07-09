class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        int n=position.length;
        int cars[][] = new int[n][2];
        for(int i=0;i<n;i++){
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        Arrays.sort(cars, (a,b) -> a[0]-b[0]);

        Stack<Double> st = new Stack<>();
        double t = (double)(target-cars[n-1][0])/cars[n-1][1];
        st.push(t);

        for(int i=n-2;i>=0;i--){
            t = (double)(target-cars[i][0])/cars[i][1];
            if(st.peek()<t){
                st.push(t);
            }
        }

        return st.size();
    }
}
