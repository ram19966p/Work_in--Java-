package ArrayJava;
 
 class LinearSearch {

    public static int largestNum(int num[]){
       int  value = Integer.MAX_VALUE;
       int value2 =Integer.MIN_VALUE;
        for( int  i= 0 ; i<num.length; i++){
            if( num[i] < value){
                value = num[i];
               
            }

            if( num[i]>value2){
                value2 = num[i];
            }

        }
        System.out.println("  The Smalest  number is in arra :"+value);

             return value2 ;

             
    }

    public static void main(String[] args) {

        int  arr[]  = { 2 ,  4, 6, 8 , 10 ,12 , 14 , 16};
        int  num[]  = { 2 ,  4, 6, 8 , 10 ,12 , 14 , 16};
        int a = 10;
        // for( int i=0 ; i<arr.length ; i++){
        //     if( arr[i] == a){
        //         System.out.println(" Value find Index Number:"+ i);
        //     }
        // } 

  int value = largestNum(num);
  System.out.println("  The largest number is in arra :"+value);

    }
    
}
