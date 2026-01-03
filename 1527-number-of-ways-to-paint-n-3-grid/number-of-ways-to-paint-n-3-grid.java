class Solution {
    private static final int MOD = 1_000_000_007;

    public int numOfWays(int n) {
        if(n==0) return 0;

        long a = 6, b = 6;
        for(int i=1; i<n; i++){
            long A = (3*a + 2*b) % MOD;
            long B = (2*a + 2*b) % MOD;
            a = A;
            b = B;
        }
        return (int) ((a+b) % MOD);
    }
}