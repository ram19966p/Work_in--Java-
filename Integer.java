 import java.util.Scanner;
 
 
 class  Integer  {
     public static void main(String[] arg) {
      Scanner  sc = new Scanner(System.in);
     
       int temp = 0 ;
       int tp = 0 ;
       char ch  ;
       do { 

        System.out.println(" Enter the  integer  number");
        int y  = sc.nextInt();
        if( y  % 2  == 0 ){
          temp =  temp+ y ;
         System.out.println(" This number is even number ");
        }else{
           
            tp = tp+y;
            System.out.println(" This number is odd number ");
        }
       System.out.println(" Do you wnat enter the outher number so press y otherwise prese another ke ");
        ch  = sc.next().charAt(0);
       } while (ch == 'y' || ch == 'Y');


       System.out.println(" Total addition of all even numbers => "+ temp); 
       System.out.println("  Total addition of   odd number =>" +tp);
       sc.close();
    }
}