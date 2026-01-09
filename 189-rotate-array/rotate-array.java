class Solution {
    public void rotate(int[] nums, int k) {
        //reverse first half and second half and then reverse full array respectively


        int n = nums.length-1;

        k = k%(n+1);
        reverse(0,n-k,nums);
        reverse(n-k+1,n,nums);
        reverse(0,n,nums);

    }

    public void reverse(int start,int end,int[] arr){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}