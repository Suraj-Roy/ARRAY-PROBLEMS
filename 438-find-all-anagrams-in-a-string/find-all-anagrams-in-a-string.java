class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;

        int[] countP = new int[26];
        int[] countWindow = new int[26];
        int pLen = p.length();

        for (char c : p.toCharArray()) {
            countP[c - 'a']++;
        }

        for (int i = 0; i < pLen; i++) {
            countWindow[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(countP, countWindow)) {
            result.add(0);
        }

        for (int i = pLen; i < s.length(); i++) {
            countWindow[s.charAt(i) - 'a']++;             
            countWindow[s.charAt(i - pLen) - 'a']--;      

            if (Arrays.equals(countP, countWindow)) {
                result.add(i - pLen + 1);
            }
        }

        return result;
    }
}