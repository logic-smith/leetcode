class Solution {
    public int rotatedDigits(int n) {
        int count = 0;
        for(int i=1; i<=n; i++){
            if(isGood(i)) count++;
        }
        return count;
    }

    private boolean isGood(int x){
        String s = String.valueOf(x);
        StringBuilder rotated = new StringBuilder();

        for(char c: s.toCharArray()){
            char r = rotate(c);
            if(r == '?') return false;
            rotated.append(r);
        }
        String rotatedStr = rotated.toString();
        return !rotatedStr.equals(s);
    }

    private char rotate(char c) {
        switch (c) {
            case '0': return '0';
            case '1': return '1';
            case '2': return '5';
            case '5': return '2';
            case '6': return '9';
            case '8': return '8';
            case '9': return '6';
            default:  return '?';
        }
    }
}