import javax .swing .JOptionPane;
class Arry
{
  public static void  main(String arg[])
{
   
int n[]={ 10, 20, 30, 40, 50};
int s = Integer.parseInt(JOptionPane.showInputDialog("Enter the num for serching"));
for(int d=0; d<5; d=d+1)
{
  if(n[d]==s)
{ 
  JOptionPane.showMessageDialog(null,"record is found");
 break;
}
}
if(d==5)
{
     JOptionPane.showMessageDialog(null,"record is not found");

} 

}
}


