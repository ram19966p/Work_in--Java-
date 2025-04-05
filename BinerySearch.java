package ArrayJava;

public class BinerySearch {

    public static int binSerarch(int num[], int key){
         int st = 0 ; 
         int end = num.length;
         while( st<= end){
             int mid = (st+end)/2;
             if( num[mid]== key){
                return mid;

             }else if( num[mid]>key){
                end = mid-1 ;
                
             }else{
                st = mid+1 ;
                
             }
         }
         return -1 ;
    }


    public static void main(String[] args) {
  
    int[] num = {2, 4, 6, 8, 10, 12};
    int key = 1;
    int value = binSerarch(num, key);
    System.out.println(" The value of index is  "+value);
    }
    
}
