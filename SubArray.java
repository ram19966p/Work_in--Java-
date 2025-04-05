package ArrayJava;

public class SubArray {

    public static void subPairArray( int num []){
        int p = 0;
      for( int i = 0 ;  i  < num.length ; i++ ){
        System.out.print("{"+num[i]+"}"+" ");
        for( int j = i + 1 ; j<num.length; j++){
           
            System.out.print("{");
          for( int k = i ; k<=j ; k++){
           
            System.out.print(num[k]+" ");
           
          }
          p++;
          System.out.print("}");
        }
        System.out.println();
      }
      System.out.println(p);
    }

    public static void main(String arg[]){
        int num[] ={ 1 , 2, 3, 4, 5,6};
        subPairArray(num);
    }
    
}
