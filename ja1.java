import java.awt.*; 
import java.applet.*; 
/* 
<Applet code="TwoB",height="300",width="300"></Applet> 
*/ 

class TwoB extends Applet 
{ 
public void paint(Graphics g) 
{ 
g.drawRect(20,0,100,50); 
g.setColor(Color.green); 
g.fillRect(140,0,100,50); 
g.drawRoundRect(20,70,100,50,10,10); 
g.setColor(Color.blue); 
g.fillRoundRect(140,70,100,50,20,20); 
g.drawRect(20,140,100,100); 
g.setColor(Color.red); 
g.fillRect(140,140,100,100); 
} 
}