package week1;

public class IsPrime {
    public static boolean isPrime(int n){

        if (n <= 1){
            return false;
        }


        for (int i = 2; i < Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        System.out.print("The number " + n + " is " + "prime. True or False? " + "The statement is " + isPrime(n));
    }
}
