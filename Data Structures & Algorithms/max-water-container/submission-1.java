class Solution {
    public int maxArea(int[] heights) {
        int i=0,j=heights.length-1;
        int max=0;
        while(i<j){
            int w=j-i;
            int h=Math.min(heights[j],heights[i]);
            int area=h*w;
            max=Math.max(max,area);   
            if(heights[j]>heights[i]) i++;
            else{j--;}

            
        }
        return max;
    }
}
