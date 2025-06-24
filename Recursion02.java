public class Recursion02 {
    //fibonacci series optimise method 
    static int[] dp = new int[31]; // assuming 0 <= n <= 30

    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (dp[n] != 0) return dp[n];

        dp[n] = fib(n - 1) + fib(n - 2);
        return dp[n];
    }


    public static void main(String[] args) {
        int n =30;
        System.out.println(fib(n));
    }
}
