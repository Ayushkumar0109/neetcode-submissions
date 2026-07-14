class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0;
        int sum1 = 0;

        for (int i = 0; i < gas.length; i++) {
            sum += gas[i];
            sum1 += cost[i];
        }
        if(sum1 > sum){
            return -1;
        }
        int total=0;
        int index=0;

        for (int i = 0; i < gas.length; i++) {
            total+= gas[i]-cost[i];
            if(total < 0){
                total=0;
                index=i+1;
            }
        }
        return index;         
    }
}
