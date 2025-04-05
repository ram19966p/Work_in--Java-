package ArrayJava;

public class Pairofarray {

    public static void  pairsOfArray(int num []){
         int tp= 0;
        for( int i = 0;  i<num.length ; i++){
            for(int j = i+1 ;j<num.length; j++){
                System.out.print("("+num[i]+","+num[j]+") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println(tp);
       
    }
     public static void main(String[] args) {
        int num[] ={1, 2, 3,4,5,6,7};
       pairsOfArray(num);
       
     }
}
