class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
       int atMostK = atMost(nums,k);
       int atMostKMinus1 = atMost(nums,k-1);
       return atMostK-atMostKMinus1;
    }

    public int atMost(int[] nums, int k){

         HashMap<Integer,Integer> map = new HashMap<>();

        int n = nums.length;
        int index = 0;
        int res = 0;

        for(int i=0;i<n;i++){

            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

           

            while(map.size()>k){

                map.put(nums[index],map.getOrDefault(nums[index],0)-1);

                if(map.get(nums[index])==0) map.remove(nums[index]);

                index++;
            }
            res += i-index+1;
        }

        return res;


    }
}