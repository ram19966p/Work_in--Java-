import  javax . swing . JOptionPane;
class OOP
{

  public static void add()
{
int a, b, c;
a=Integer.parseInt(JOptionPane.showInputDialog(" Enter the first number "));
b=Integer .parseInt(JOptionPane.showInputDialog("Enter the second number" ));

c=a+b;
JOptionPane.showMessageDialog(null," Sum of two number is :>" +c);
}
 public static void multi()
{ int q ,w, r;
 q=Integer.parseInt(JOptionPane.showInputDialog(" Enter the first number "));
w=Integer .parseInt(JOptionPane.showInputDialog("Enter the second number" ));
r=q*w;
JOptionPane.showMessageDialog(null," Multiplt is " + r);

}


 public static void main(String arg[])
{
  OOP.add();
OOP.multi();
}
}
 