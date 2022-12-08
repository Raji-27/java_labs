import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class textfield implements ActionListener 
{
Frame f=new Frame();
Label l1,l2;
TextField t1,t2,t3;
textfield()
{
l1=new Label("Name :",Label.LEFT);
l2=new Label("Password:",Label.LEFT);
t1=new TextField(15);
t2=new TextField(15);
t2.setEchoChar('?');
t3=new TextField(40);
l1.setBounds(100,100,100,20);
l2.setBounds(100,200,100,20);
t1.setBounds(250,100,150,20);
t2.setBounds(250,200,150,20);
t3.setBounds(50,300,400,20);
f.add(l1);
f.add(l2);
f.add(t1);
f.add(t2);
f.add(t3);
t1.addActionListener(this);
t2.addActionListener(this);
f.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
});
f.setSize(450,450);
f.setLayout(null);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
t3.setText(t1.getText()+" "+t2.getText()+" "+"selected text is"+t1.getSelectedText());
}
public static void main(String[] arg)
{
new textfield();
}
}
