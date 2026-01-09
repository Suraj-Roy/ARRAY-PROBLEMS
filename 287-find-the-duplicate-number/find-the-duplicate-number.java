class Solution {
    public int findDuplicate(int[] nums) {

        HashSet<Integer> temp = new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            if(temp.contains(nums[i])){
                return nums[i];
            }
            else{
                temp.add(nums[i]);
            }
        }
        return -1;
       
    }
}