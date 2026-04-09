class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length-1;
        int water = 0;
        
        while(i<j){
            
            
            int max_water = Math.min(heights[i],heights[j]) * (j-i);
            water = Math.max(max_water,water);
            if(heights[i]<heights[j]){
                i++;
            }else{
                j--;
            }
            
            
        }
        return water;
         
         
    }
    
}
