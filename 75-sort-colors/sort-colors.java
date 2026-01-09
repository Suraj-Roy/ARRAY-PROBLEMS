class Solution {
    public void sortColors(int[] nums) {

        int start = 0;
        int mid = 0;
        int end = nums.length-1;

        while(mid<=end){
            if(nums[mid]==1) mid++;
            else if(nums[mid]==2){
                nums[mid] = nums[end];
                nums[end]=2;
                end--;
            }else{
                nums[mid] = 1;
                nums[start]=0;
                start++;
                mid++;
            }
        }
        
    }
}