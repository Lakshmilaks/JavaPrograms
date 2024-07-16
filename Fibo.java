public class Fibo{
    static long nthFibonacci(long n){
        long n1 = 1;
        long n2 = 1;
        long n3 = 0;

        if(n<=2){
            return 1;
        }
        for(long i =1;i<=n-2;i++){
            n3 = n1+n2;
            n3 = 1000000007%n3;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }

    public static void main(String[] args){
        System.out.println(nthFibonacci(15));
    }
}