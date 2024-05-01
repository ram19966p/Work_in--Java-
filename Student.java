import javax.swing .JOptionPane;
  class Student
{
  public static void main(String arg[])

{
  String n[][],t, p,s= "  ";
n=new String[5][2];
int a ,q, b, c,z,f;
for(a=0;a<2; a=a+1)
{
  n[a][0]= JOptionPane.showInputDialog(" Enter the  name for student :" );
for(b=0;b<1;b=b+1)
{

   n[a][1]= JOptionPane.showInputDialog(" Enter the marks : m1 >:");
f=Integer.parseInt( n[a][1]);

   n[a][1]=JOptionPane.showInputDialog("Enter the marks : m2 > : ");
c=Integer.parseInt( n[a][1]);

   n[a][1]=JOptionPane.showInputDialog("Enter the  phone number:>");
 q=Integer.parseInt(n[a][1]); 

s=s+" \n"+n[a][0]+ "  " +f+ "  " +c+ "  Phone num:>  " +q;
}

}

JOptionPane.showMessageDialog(null," student record is number of M1 and m2  :>"+ "   " + s);
t=Integer.parseInt(JOptionPane.showInputDialog("Serch the student record  NAme/numbers :"));
for(z=0;z<5;z=z+1)
{
 for(q=0;q<5;q=q+1)
{
  if(n[z][q].equals(t)||n[z][q].equals(t))
{
 JOptionPane.showMessageDialog(null,"Record is founded student name :> "+n[z][q]);
}
}
}     
}
}

