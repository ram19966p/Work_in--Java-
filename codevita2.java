import java .util.*;


public class CodeVita2
{
public  static void main(String  args[]){
Scanner sc =  new Scanner(System.in);
double  p =0  ;
int  totalYear   ;
double[]  bank = new  double[2];
int l =0 ; 
System.out.println("Enter the Principal Amoun");
 double p1 =  sc.nextDouble();
System.out.println("Enter the Texture  Year ");
totalYear = sc.nextInt();
double sum = 0;
for(int i =0 ; i<2 ; i++){
System.out.println("Enter the number of slab");
int n1 = sc.nextInt(); 
for( int j =0 ; j<n1 ; j++){
System.out.println("Enter the number  Period ");
int year = sc.nextInt();
System.out.println("Enter the number of interest");
double intere  = sc.nextDouble();
double sq = Math.pow(1+intere,year*12);
double emi = (p *(intere))/(1-1/sq);
sum += emi ;
} 
bank[l] = sum ;
l++;
}
double bankA = bank[0];
double bankB = bank[1];
if(bankA < bankB){
System.out.println("BankA");
}else{
System.out.println("BankB");
}
}
}





