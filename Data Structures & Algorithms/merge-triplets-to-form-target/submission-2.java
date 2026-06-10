class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        int max1=0;
        int max2=0;
        int max3=0;
        for(int[] val :triplets){
            if(val[0]==target[0] && val[1]==target[1] && val[2]==target[2] ){
                return true;
            }
            else if(val[0]<=target[0] && val[1]<=target[1] && val[2]<=target[2] ){
                max1 =Math.max(max1,val[0]);
                max2 =Math.max(max2,val[1]);
                max3 =Math.max(max3,val[2]);
            }
        }
        return (max1==target[0] && max2==target[1] && max3==target[2] );
        
    }
}
