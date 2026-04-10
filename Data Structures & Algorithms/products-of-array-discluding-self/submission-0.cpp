class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> product;
       
        for(int i=0;i<nums.size();i++){
            int tempProduct=1;
            for(int j=0;j<nums.size();j++){
                if(i == j){
                    continue;
                }else{
                    tempProduct =tempProduct *nums[j];
                }
            }
            product.push_back(tempProduct);
        }
        return product;
    }
};
