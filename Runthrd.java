import java.io.*;
class Th2 implements Runnable{ 
public void run()
{
for(int i =0;i<=100;i++)
{
System.out.println("message from 2nd thread: "+i);
try
{
Thread.sleep(6000);
}
catch(Exception e2)
{
System.out.println("error occured"+e2);
}
}
}
}
class Runthrd extends Thread{ 
public void run()
{
for(int i=0;i<=5;i++)
{ 
System.out.println("message from 1st thread: "+i);
try
{ 
Thread.sleep(3000);
}
catch(Exception e)
{
System.out.println("error occured"+e);
}
}
}
} 
public class demo{ 
public static void main(String args[])
{
Runnable obj=new Runnable();
Runthrd obj1=new Runthrd(); 
Thread obj2=new Thread(obj);
obj2.start();
obj1.start();
}
}
}










