class Solution {
    public int findMaxLength(int[] nums) {

       int arr[] = Arrays.stream(nums).map(n->n==0?-1:1).toArray();
       Map<Integer,Integer> map = new HashMap<>();

       int sum = 0;
       int res = 0;
       map.put(0,-1);
       for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum)){
                res = Math.max(res,i-map.get(sum));
            }else{
                map.put(sum,i);
            }
            
       }

       return res;
    }
}