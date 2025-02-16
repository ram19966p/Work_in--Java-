 import java.util.Scanner;
 

 
 class ThreeNUm {

   public static  Scanner obj = new Scanner(System.in);




    public static void three(int a, int b, int c ){
    if(a>b){
        if(a>c){
            System.out.println("The  Largest num:"+a);
        }else{
            System.out.println("The Largest Num is :"+c);
        }
    }else if(b>c){
            System.out.println("The Largest Num is:"+b);
    }else{
        System.out.println("The Largest Num is:"+c);
    }

}

     public static void main(String[] arg) {
        System.out.println(" Enter the first number ");
        int  a   =  obj.nextInt();
        System.out.println(" Enter the second number ");
        int b = obj.nextInt();
        System.out.println(" Enter the third  number ");
        int c = obj.nextInt();
        three( a,b, c);
     
    }
}