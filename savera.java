import java.io.*;
class savera{
public static void main(String args[]) throws Exception{
savera ob = new savera();
ob.me();
}
public void me() throws Myexception{
for(int i=0;i<=5;i++){
System.out.println("hey buddy!");
if(i==3)
{
throw new Myexception("this is my own custom error");
}
}
}
}

