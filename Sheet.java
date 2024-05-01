import javax .swing.JOptionPane;
class Sheet
{
   public static void main(String arg[])
{
  String srec [][] , s= " "; 
   srec=new String[2][2];
int v,b,a=0, t=0,f,m,k=0,c,r,z,q;
 for(v=0;v<2; v=v+1)
{
srec[v][0] =JOptionPane.showInputDialog("Enter the name");

 srec[v][1]= JOptionPane.showInputDialog("Enter the fee");
 
f=Integer.parseInt(srec[v][1]);
s=s+"\n"+srec[v][0]+"  "+f;
t=t+f;
}

JOptionPane.showMessageDialog(null,"Name of student is: >"+" "+s); 
JOptionPane.showMessageDialog(null, "Total fees collection is:>"+ t);
    m = Integer.parseInt(JOptionPane.showInputDialog( "Enter the name /fee for searching is :>"));
for(z=0; z<5; z=z+1)
{

   JOptionPane.showMessageDialog(null,"Record is founded "+srec[v][0]);
}

}
}
