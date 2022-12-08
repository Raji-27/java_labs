
import java.io.*;
class Est extends Thread
 {  
 public void run()
 {  
for(int i=1;i<5;i++)
 {  
 try
 {
 Thread.sleep(5000);
}
 catch(InterruptedException e)
{
System.out.println(e);
 }  
 System.out.println(i);  
 }  
 }  
 public static void main(String args[])
{  
 Est t1=new Est();  
 Est t2=new Est();  
  t1.start();  
  t2.start();  
 }  
}
