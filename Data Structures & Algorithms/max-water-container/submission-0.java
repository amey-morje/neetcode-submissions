class Solution {
    public int maxArea(int[] heights) {
        int maxA = 0;
        int i = 0;
        int j = heights.length-1;

        while(j > i){
            maxA = Math.max(maxA, ((j-i)* Math.min(heights[i], heights[j])));

            if(heights[i] > heights[j]){
                j--;
            } else{
                i++;
            }
        }
        return maxA;
    }
}
