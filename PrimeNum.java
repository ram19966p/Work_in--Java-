import java.util.Scanner;


public class PrimeNum {
  
    public static boolean prime(int n ){
        if(n<=1){
            return false ;
        }
        int div = 2 ;
         while (div < n ) {
            if( n %2 == 0){
                return false;
            }
            div++;
         }
         return true ;

    }

public static void main(String[] arg){
       Scanner obj = new Scanner(System.in);
    System.out.println("Enter any Number");
    int a = obj.nextInt();
    obj.close();

    if(prime(a)){
     System.out.println(" This number is prime ");
    }else{
        System.out.println(" Thish number is not prime");
    }
}
    
}
