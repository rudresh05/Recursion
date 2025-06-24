public class Recursion03 {
    //1137 leetcode
     static   int dp[] = new int[38];
    public static int tribonacci(int n) {
        if(n==0) return 0;
        if(n==1 || n==2)return 1;
        if(dp[n] != 0) return dp[n];
        dp[n] = tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
        return dp[n];

    }
    public static void main(String[] args) {
        int n =27;
        System.out.println(tribonacci(n));
    }
}
