package week1;
public class fibonacci{
    public static void fib(int n){
        int num1 = 1;
        int num2 = 1;

        System.out.print(num1 + " " + num2 + " ");
        for (int i = 2; i < n; i++){
            int num3 = num1 + num2;
            System.out.print(num3 + " ");
            
            num1 = num2;
            num2 = num3;
        }
    }
    public static void main(String[] args){
        fib(10);
    }
}