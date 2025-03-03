 
 import java.util.Scanner;
 
 public class Continue {
    public  static void main(String[] arg){
    
        Scanner sc = new Scanner(System.in);
       char ch ='y';
           do{


                System.out.println( "Enter the any  number ");
               int j = sc.nextInt();
               


               if( j % 10 == 0  ){
                System.out.println("Multiples of 10 are ignored!");
                   continue ;
                   
               }
       
               System.out.println("You have Entered Number  Dont worry be patiens your input 10 multiple not display do be panic "+j);

                System.out.println("Do you want another Number enter");
                ch = sc.next().charAt(0);
            }while (ch == 'Y' || ch == 'y');
            
        }

    }
    

