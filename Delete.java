import javax .swing. JOptionPane;
class Delete
{
  public static void main(String arg[])
{
    int n[]={ 10, 20, 30, 40, 50};
int s= Integer.parseInt(JOptionPane.showInputDialog ("Enter the num delete "));
int   tn= 5;
int t=0;
String s ="  ";

for( int v=0; v<tn-t;v=v+1)
{ 
  if(n[v]==s)
{ 
 t=t+1 ;
}
if(t>=1)
{
  n[v]=n[v+1];

}
}
for(int v=0 ;v<4;v=v+1)
{
    s=s+"\n" n[v] ;
}
JOptionPane.showMessageDialog(null,s);
}
}