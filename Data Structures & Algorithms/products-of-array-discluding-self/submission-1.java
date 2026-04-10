class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] product = new int[n];
        
        for (int i = 0; i < n; i++) {
            int tempProduct = 1;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                } else {
                    tempProduct *= nums[j];
                }
            }
            product[i] = tempProduct;
        }
        
        return product;
    }
}