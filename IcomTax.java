 import java.util.Scanner ;
 
 
 class IcomTax  {
 
      static void Incom( int Icom){
       System.out.println(Icom);
        if(Icom <= 500000){
            System.out.println("hy broo  0  persent tax ");

        }
        if(Icom >500000  && Icom < 1000000 ){
                float   gov = Icom*20/100 ;
                System.out.println("Your Icom Tax "+gov);
        }else if ( Icom > 1000000 ) {
            float  gov = Icom*30/100 ;
            System.out.println("Your Icom Tax"+gov);
        } else {
            
        }

      }

          public static void main(String[] arg) {
             Scanner obj = new Scanner(System.in);

             System.out.println(" Enter the Your Incom");
           int icom = obj.nextInt();
            Incom(icom);
         
    }
}