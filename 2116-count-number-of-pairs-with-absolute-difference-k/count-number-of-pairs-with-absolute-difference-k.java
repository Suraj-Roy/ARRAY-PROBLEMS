class Solution {
    public int countKDifference(int[] nums, int k) {

        Map<Integer,Integer> map = Arrays.stream(nums).boxed()
        .collect(Collectors.toMap(n->n,n->1,(newVal,oldVal)->newVal+oldVal));

        int res = 0;

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(k+nums[i])){
                res+=map.get(k+nums[i]);
            }
        }

        return res;
        
    }
}