import java.util.Scanner;

 class Multiple10 {
    public static  void main(String arg[]){
       char ch ;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Number But without 10 multiple if you have entered program terminate ");
            int  i  = sc.nextInt();
         if( i % 10 == 0){
            System.out.println("sorry You are entered multilple by 10 so i can not run proram again you will try next time ");
            break ;
         }
        System.out.println("you are a Enteretd :"+i);
        System.out.println("do you want another input :"+i);
        ch = sc.next().charAt(0);
        } while (ch =='Y' ||  ch =='y');


    //     int  i =0 ;
    //  do {
    //     Scanner sc = new Scanner(System.in);
    //         System.out.println("Enter the Number But without 10 multiple if you have entered program terminate ");
    //           i  = sc.nextInt();
    //         System.out.println("you are a Enteretd :"+i);
        
    //  } while (i % 10 !=0);



    }
    
}
