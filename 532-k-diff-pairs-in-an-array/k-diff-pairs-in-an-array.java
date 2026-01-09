class Solution {
    public int findPairs(int[] nums, int k) {

        Map<Integer,Integer> map = Arrays.stream(nums).boxed()
        .collect(Collectors.toMap(n->n,n->1,(newVal,oldVal)->oldVal+newVal));

        int res = 0;

        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(k+nums[i])&&!set.contains(nums[i])){
                if(k==0){
                    if(map.get(nums[i])>1) res++;
                } else res++;
               set.add(nums[i]);
            }
        }

        return res;
        
    }
}