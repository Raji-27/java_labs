import java.awt.*;
import java.awt.event.*;
class framedemo
{
public static void main(String[] args)
{
Frame f=new Frame("my first frame");
f.setSize(500,500);
f.setLayout(null);
f.setVisible(true);
f.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
});
}
}