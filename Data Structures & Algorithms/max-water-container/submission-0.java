class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;
        int m=0;

        while(i<j){
            m=Math.max(m,(j-i)*Math.min(heights[i],heights[j]));
            if(heights[i] < heights[j]){
                i+=1;
            }
            else{
                j-=1;
            }
        }
        return m;
        
    }
}
