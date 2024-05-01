import javax.swing.JOptionPane;
class  DO
{
  public static void main(String arg[])
{   
  int  r , t, h;
  char want;
String s = " ";
  
  do 
{
r=Integer.parseInt(JOptionPane.showInputDialog(" Enter the fist   number"));
t=Integer.parseInt(JOptionPane.showInputDialog("Enter the  second number " ));
  h=r+t;
JOptionPane.showMessageDialog(null,"Sum of two number"  +h); 
 s=JOptionPane.showInputDialog("do you want countinue press botton y/n ");
want=s.charAt(0);
}while(want == 'y' || want == 'Y');
}
}

