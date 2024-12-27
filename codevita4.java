import java .util.*;

public class CodeVita4
{

public static int way(int n){
  if( n == 0 || n == 1 ){
return 1 ;
}
  return way( n-1 ) +  way(n-2);

}

public  static void main(String  args[]){
Scanner sc =  new Scanner(System.in);
System.out.println("Enter the Number of stair");
int n = sc.nextInt();
int ans = way(n);
System.out.println(ans);
}
}





