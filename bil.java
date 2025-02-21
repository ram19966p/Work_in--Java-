 class bil {

     public static void main(String[] arg) {
        // Type promotion 1 type 
    //   byte bt = 4 ;
    //   char ch = 't' ;
    //   int b = 78 ;
    //   short  s = 7 ;
    //   int s1 = bt+ch+b+s;



    //  Type Promotion  2  Type 
    
    // double du = 7896.890;
    // long l = 5666656l;
    // float f = 67.980f;
    // double  du1  = du+l+f;


    // byte bt =  5 ;
    // bt =(byte) (bt*2) ;

    byte bt = 4 ;
    short s = 512 ;
    char ch =  'a';
    int  i = 1000;
    float ft = 3.14f;
    double d = 99.9954;

   double du =  (ft * bt) + (i  % ch ) - (d * s);
     System.out.println(du);


     
    }
}