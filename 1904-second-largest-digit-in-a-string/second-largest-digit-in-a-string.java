class Solution {
    public int secondHighest(String s) {
        
        int max = -1;
        int secondMax = -1;

        for(int i = 0;i<s.length(); i++ ){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                int val = ch-'0';
                if(val>max){
                    secondMax=max;
                    max = val;
                }
                else if(val!=max && val>secondMax){
                    secondMax = val;
                }
               
            }
        }
        return secondMax;
        
    }
}