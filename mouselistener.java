import java.awt.*; 
import java.awt.event.*; 
public class mouselistener extends Frame implements MouseListener 
{ 
Label l; 
 mouselistener(){ 
 
 
 l=new Label(); 
 l.setBounds(20,50,100,20); 
addMouseListener(this); 
 add(l); 
 setSize(300,300); 
 setLayout(null); 
 setVisible(true); 
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
});
 } 
 public void mouseClicked(MouseEvent e) { 
 l.setText("Mouse Clicked"); 
 } 
 public void mouseEntered(MouseEvent e) { 
 l.setText("Mouse Entered"); 
 } 
 public void mouseExited(MouseEvent e) { 
 l.setText("Mouse Exited"); 
 } 
 public void mousePressed(MouseEvent e) { 
 l.setText("Mouse Pressed"); 
 } 
 public void mouseReleased(MouseEvent e) { 
 l.setText("Mouse Released"); 
 } 
public static void main(String[] args) { 
 new mouselistener(); 
} 
}