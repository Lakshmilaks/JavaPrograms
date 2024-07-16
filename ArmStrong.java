import java.util.Scanner;

public class ArmStrong {
    
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number: ");
    int n = sc.nextInt();
    boolean rs = isArmStrong(n);
    if(rs){
        System.out.println(n+" is armStrong number");
    }else{
        System.out.println(n+" not arm Strong number");
    }

   }

    static boolean isArmStrong(int x){
        int dc = coundDigit(x);
        int sum = 0,nValue=x;
        do{
            int d = x%10;
            sum = sum +pow(d,dc);
            x = x/10;
        }while(x!=0);
        return sum ==nValue;
    }
      static int pow(int d, int dc) {
        int pro =1;
        while(dc>0){
            pro = pro*d;
            dc--;
        }
        return pro;

    }
    static int coundDigit(int y) {
       int count = 0;
       do{
        count++;
        y = y/10;
       }while(y!=0);
       return count;
    }
}
