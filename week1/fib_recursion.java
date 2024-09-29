package week1;

public class fib_recursion {
    public static int fib(int n){
        if (n<=1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args){
        int num = 10;
        fib(num);
        System.out.print("Fib " + num + " is = " + fib(num));
    }
}
