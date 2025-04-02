public class halfpyramid {

    public static void inverted_Half_Pyramid(int  row ){
        for(int i = 1; i<row ; i++){
            for(int j = 1 ; j< row - i ; j++){
                System.out.print(" ");
                
            }
            for(int k = 1 ; k<=i ; k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

// Inverted half Pyrimid with number 

public static void witNum(int  row){
  for(int i = 0 ; i<=row ; i++){
    for( int j = 1 ; j<=row -i; j++){
        System.out.print(j);


    }
      

      System.out.println();
    
  }
}


  public static void  floyadTringe(int n ){
    int coun = 1 ;
   for( int i = 0 ; i <= n ; i++){
    for( int j = 0 ; j <i ; j++){
   System.out.print(coun+" ");
   coun++;
    }
    System.out.println();
   }
  }

    
// o and 1 Pattern 

public static void tringle12(int n){
   
    for( int i = 1 ; i<= n; i++){
        for( int j = 1 ; j<=i; j++){
           
            if( (i+j) % 2 == 0 ){
                System.out.print(1);
               
            }else{
                System.out.print(0);
              
            }


        }
        System.out.println();
    }

}

 public  static void butterFly(int n ){

 }


     public static void main(String[] args) {;
        int row = 5 ;
        // inverted_Half_Pyramid(row);
         // witNum(row);
        // floyadTringe(row);
        tringle12(row);

     }
}
