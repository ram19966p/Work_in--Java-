package ArrayJava;

public class MaxSubarray {
    public static void subPairArray( int num []){
        int p =  Integer.MIN_VALUE ;
        
      for( int i = 0 ;  i  < num.length ; i++ ){
       
        for( int j = i + 1 ; j<num.length; j++){
            int current =0 ;
          for( int k = i ; k<=j ; k++){
            current = current+ num[k];
            if( p < current){
                p = current ;
            }
           
           
          }
         
        }
        
      }
      System.out.println(p);
    }


     public static void prifix(int num []){
        int prifix1[] = new int[num.length];
        int st = 0 ;
        for(  int i = 0 ; i<num.length; i++){
          int end = 0;
            for( int j = i+1 ; j<num.length ; j++){
                prifix1[st] = prifix1[st]+num[i];
               
               

                System.out.println(prifix1[i]);
            }
        }
        
     }

    public static void main(String arg[]){
        int num[] ={ 1 ,  3, 5};
        //subPairArray(num);
        prifix(num);
    }
    
}
