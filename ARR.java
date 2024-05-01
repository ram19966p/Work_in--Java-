import javax.swing.JOptionPane;
 class ARR
{
  public static void main(String hy[])
{

  int v;
  int len = hy.length;//(lenght variable hai String class hai class ka object hy hai hy ke //refrence se chalta hai)  
String s=" ";
for(v=0; v<len; v=v+1)
{  
   s=s+ hy[v]+"\n";
}

JOptionPane.showMessageDialog(null,"No of element is: >"+ len+" \n "+s);
}
}