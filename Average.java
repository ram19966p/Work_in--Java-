import java.util.Scanner;

public class Average {

    public static void isAver(int a ,int b ,int c ){


        int d =  (a+b+c)/3;
        System.out.println(d);

    }


    public static void isEven(int a ){
        boolean isbool = false ;
        if( a % 2 == 0){
            isbool = true ;
        }
        System.out.println("Your given num is Even  "+isbool);
    }


       // palidrome 
       public static void palidrome(int a ) {
        int rem = 0 ; 
         int real = a ;
         int pali = 0 ; 
         while (a>0) {
              rem = a % 10 ; 
              pali = pali*10 +rem ;
            a = a/10;
             
        }
       
        if( real == pali ){
         System.out.println(" this number  is palidrom "+pali);
        }

        
       }


       public static void numerAdd(int a ){

        int rem =0 ;
        int num = 0 ;
        while (a>0) {
            rem = a % 10 ; 
            num = num+rem;
            a = a/10 ;
            
        }

        System.out.println("The number addition is "+num);

   }

    public static void main(String arg[]){
  Scanner  sc  = new Scanner(System.in);
  System.out.println("Enter the firsr num");
  int a =sc.nextInt() ;
//   System.out.println("Enter the  second  num");
//   int b = sc.nextInt();
//   System.out.println("Enter the third  num");
//   int c = sc.nextInt();

//   isAver(a, b, c);

//isEven(a);
//palidrome(a);
numerAdd(a);

    }
    
}
