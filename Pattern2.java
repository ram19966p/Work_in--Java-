public class Pattern2 {


    public static void rombas(){
        for(int i = 0 ; i < 6 ; i ++){

            for( int j = i;  j < 6 ; j++ ){

                System.out.print(" ");
            }
            
            for( int  k= 0 ; k< 6 ; k++){
                System.out.print(" *");
            }
        
            System.out.println();
        }
    }



     // Inverted Half Pyramid With Number 

     public static void  number(){
        for( int i = 6; i >0 ; i --){
            for( int j = 1 ; j < i ; j++){
                System.out.print(j);
            }
          
            System.out.println();
        }
     }




     // Floads Tringle Pattern 


     public static void floads(){
     int  k = 1 ;
        for( int  i =1; i < 6 ; i ++){
            for( int j = 0 ; j < i; j++){
                System.out.print(k);
                k++ ;
                }
            System.out.println();
        }
     }


     //  0 -1`  Tringle pattern 


     public static void bineryTringle(){
       int k = 0 ;
        for( int i = 0 ; i < 6 ; i ++){
            int t = k ;
            for( int j = 0; j < i ; j++){

            if( t == 1 || t == 0){
                if( t == 1){
                     k =0 ;
                     t= 0;
                     System.out.print(k);
                }else{
                    k =1 ;
                    t = 1;
                    System.out.print(k);
                }
             }
            }
            System.out.println();
        }
     }


     public static void bool(){
        boolean isbool = true ;
        int k = 0 ;
        for( int i = 0 ; i<= 6 ; i++) {

            for( int j = 0 ; j <= i ; j++){
                if( !isbool ){
                    k =1 ;
                 
                }else{
                  k = 0 ;
                
              }
              System.out.print(k);
              isbool =  !isbool ;

              
            }
            
            System.out.println();
        }

     }


    public static void main(String arg[]){

        bool();
       //  bineryTringle();
          //floads();
      // number();
         
        // Inverted Half Pyrimid 

    //rombas();
        // for( int  i =0 ;  i < 6 ; i++){

        //     for( int  j = 6 ; j >i ; j--){
        //         System.out.print("  ");
        //     }

        //     for(int k = 0 ; k<i; k++) {
        //         System.out.print(" *");
        //     }
        

        //     System.out.println();
           
        // }






    }
    
}
