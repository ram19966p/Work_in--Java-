public class Rever {
    public static void main(String arg []){
        int n = 9876 ;
        int t = 0;
      while( n != 0){
        int j  = n % 10 ;
        t = t * 10 + j ;
        n /= 10 ;
      }
      System.out.print(t);
       
        }

    }
    

