class Solution {
    public int maxArea(int[] heights) {
        int i=0, j=heights.length-1, maxArea=0;
        while(i<j){
            int height=Math.min(heights[i],heights[j]);
            int width=j-i;
            maxArea=Math.max(height * width,maxArea);
            if(heights[i]<heights[j]) i++;
            else j--;
        }
        return maxArea;
    }
}
