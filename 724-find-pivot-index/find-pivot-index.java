class Solution {
    public int pivotIndex(int[] nums) {
        
        int pre[] = new int[nums.length];
        
        int sum=0;
        
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            pre[i]=sum;
        }
        
        for(int i=0;i<nums.length;i++){
            if(pre[i]-nums[i]==sum-pre[i]) return i;
        }
        
        return -1;
        
    }
}