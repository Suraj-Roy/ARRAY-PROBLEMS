class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        List<Integer> arrList = new ArrayList<>();
      
        
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                arrList.add(nums2[i]);
                set.remove(nums2[i]);
            }
        } 



        return arrList.stream().mapToInt(Integer::intValue).toArray();
    }
}