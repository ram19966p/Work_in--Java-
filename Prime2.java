
import java.util.Scanner ;
public class Prime2 {
    public static void  main(String arg[]){
      Scanner sc = new Scanner(System.in);
      System.out.println(" Enter  The any number  to find  Prime or  NOt ");
        int  n = sc.nextInt();
        boolean isPrime = true ;
    //     for(int i = 2 ; i< (n-1) ; i++){
    //      if( n % i == 0 ){
    //         System.out.println(" Is number in not Prime");
    //             isPrime = false ;
    //             break ;
    //      }

    //   }
    //   if(isPrime == true){
    //     System.out.println(" Is Number Prime ");
    //   }
          


    // Math.sqrt  jo ki ek  fumction hai jo hame number ka squre nikal ke deta hai 

    for(int i = 2 ; i< Math.sqrt(n) ; i++){
        if( n % i == 0 ){
           System.out.println(" Is number in not Prime");
               isPrime = false ;
               break ;
        }

     }
     if(isPrime == true){
       System.out.println(" Is Number Prime ");
     }


    }
    
}
