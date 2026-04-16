class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max_1s = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                count++;
                max_1s = Math.max(count,max_1s);
            }else{
                count = 0;
                
            }
        }
        return max_1s;
        
    }
}