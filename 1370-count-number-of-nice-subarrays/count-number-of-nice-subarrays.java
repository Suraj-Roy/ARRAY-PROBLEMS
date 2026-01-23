class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        count.put(0, 1);

        int odd = 0, res = 0;
        for (int num : nums) {
            odd += (num % 2);
            res += count.getOrDefault(odd - k, 0);
            count.put(odd, count.getOrDefault(odd, 0) + 1);
        }
        return res;
    }
}