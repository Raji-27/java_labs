import java.io.*;
class Raji extends Thread{
public void run()
{ 
for(int i=0;i<=10;i++)
{ 
try
{ 
Thread.sleep(3000);
}
catch(Exception e)
{ 
System.out.println(e); 
} 
System.out.println("3"+"*"+i+"="+(3*i));
}
}
public static void main(String args[])
{
Raji obj=new Raji();
obj.start();
}
}