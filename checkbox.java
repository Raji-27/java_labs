import java.awt.*;
import java.awt.event.*;
public class checkbox implements ItemListener
{
Frame f;
Checkbox Win98, winNT, solaris, mac;
TextField tf;
checkbox()
{
f=new Frame("checkbox");
tf=new TextField();
tf.setBounds(100,300,200,20);
Win98 = new Checkbox("win98");
Win98.setBounds(100,100,70,30);
winNT = new Checkbox("winNT");
winNT.setBounds(100,150,70,30);
solaris = new Checkbox("Solaris");
solaris.setBounds(100,200,70,30);
mac = new Checkbox("Mac");
mac.setBounds(100,250,70,30);
f.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
});
Win98.addItemListener(this);
winNT.addItemListener(this);
solaris.addItemListener(this);
mac.addItemListener(this);
f.add(Win98);
f.add(winNT);
f.add(solaris);
f.add(mac);
f.add(tf);
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
}
public void itemStateChanged(ItemEvent e)
{
if(e.getSource()==Win98)
{
tf.setText("you pressed"+" "+Win98.getLabel()+" "+Win98.getState());
}
if(e.getSource()==winNT)
{
tf.setText(winNT.getLabel()+" "+winNT.getState());
}
if(e.getSource()==solaris)
{
tf.setText(solaris.getLabel()+" "+solaris.getState());
}
if(e.getSource()==mac)
{
tf.setText(mac.getLabel()+" "+mac.getState());
}
}
public static void main(String[] args)
{
new checkbox();
}
}