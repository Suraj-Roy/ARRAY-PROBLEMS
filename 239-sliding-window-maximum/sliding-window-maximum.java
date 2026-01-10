class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       Deque<Integer> dque = new ArrayDeque<>();
       int res[] = new int[nums.length-k+1];

       for(int i=0;i<nums.length;i++){

            while(!dque.isEmpty()&&dque.peekFirst()<=i-k) dque.pollFirst();
            while(!dque.isEmpty()&&nums[dque.peekLast()]<=nums[i]) dque.pollLast();
            dque.offerLast(i);
            if (i>=k-1) {
                res[i - k + 1] = nums[dque.peekFirst()];
            }
       }
       return res;
    }
   
}