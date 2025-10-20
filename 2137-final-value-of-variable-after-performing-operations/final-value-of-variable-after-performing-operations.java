class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        int n = operations.length;
        for(int i=0; i<n; i++){
            String s = operations[i];
            if(s.charAt(0) == '-' || s.charAt(s.length()-1) == '-'){
                x--;
            }else{
                x++;
            }
        }
        return x;
    }
}