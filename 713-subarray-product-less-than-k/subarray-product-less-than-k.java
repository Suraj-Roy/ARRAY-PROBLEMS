class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int prod=1,left=0,res=0;
        for(int i=0;i<nums.length;i++){
            prod *= nums[i];

           while(prod>=k){
            prod /= nums[left++];
           }

           res += (i-left+1);
        }

       
        return res;
    }
}