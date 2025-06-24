public class Recursion01{
    public static void main(String[] args) {
        //recursion basics
        int n =5;
        print1ToN(n);
    }

    private static void print1ToN(int n) {
        if(n==0 ) return;
        print1ToN(n-1);
        System.out.print(n+" ");
    }
}