import java.util. * ; 
 
 class Calculater {
    public  static  Scanner obj =   new Scanner(System.in);
    static int a = 0  ; 
    static int b = 0 ;

    public static  void add(){
        System.out.println(" Enter the First num a =>");
        a = obj.nextInt();
        System.out.println(" Enter the First num b=>");
        b = obj.nextInt();

        int c = a+b ; 
        System.out.println(" Addition of two number is "+ c );
    }


    public static void sub(){
        System.out.println(" Enter the First num a =>");
        a = obj.nextInt();
        System.out.println(" Enter the First num b=>");
        b = obj.nextInt();

        int c = a-b ; 
        System.out.println(" Subtartion  of two number is " +c );
    }



    public static void mul(){
        System.out.println(" Enter the First num a =>");
        a = obj.nextInt();
        System.out.println(" Enter the First num b =>");
        b = obj.nextInt();

        int c = a*b ; 
        System.out.println(" Multiply  of two number is " +c );
    }



    public static void dive()
    {
        System.out.println(" Enter the First num a =>");
        a = obj.nextInt();
        System.out.println(" Enter the First num b =>");
        b = obj.nextInt();

        float c = a/b ; 
        System.out.println(" divide  of two number is " +c );
    }


    public static void modu(){
        System.out.println(" Enter the First num a =>");
        a = obj.nextInt();
        System.out.println(" Enter the First num b =>");
        b = obj.nextInt();

        float  c = a%b ; 
        System.out.println(" Modulo  of two number is "+ c );
    }

    public static void main(String[] arg) {
        int number  ;
        
      
        System.out.println(" you have only 5 choice  Enter the Number Choice  Base \n 1 = Addition \n 2= Subtact \n 3= Multiplt \n 4= Divide  \n 5 = Modulo");
         number = obj.nextInt();
        
       switch (number) {
         case 1 : add();

         break ;
         case 2 : sub();
         break ;
         case 3 : mul();
         break ;
         case 4 : dive();
         break ;
         case 5 :modu();
         break;
        default :
        System.out.println("  YoU are`t any operstion select please try again ");
      } 
 

    }
  
       
    
}
