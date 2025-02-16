import java.util.Scanner ;


public class SumNatural {
    
public static void sum(int n ){

    int temp = 0 ;
    for(int i = n;  i >= 0 ; i--){
       temp  = temp+i;
       //System.out.println("The sum of All Natural Number "+temp);
}
 System.out.println("The sum of All Natural Number "+temp);
}
public static void main(String[] arg){
    Scanner obj = new java.util.Scanner(System.in);
    System.out.println(" Enter the Natural Number");
    int a = obj.nextInt();
    obj.close();
    sum(a);
}
}
