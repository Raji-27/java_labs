import java.io.*;
import java.util.Scanner;
class fact{
public static void main(String args[]){
int n,fact,i;
fact =1;
Scanner s = new Scanner(System.in);
System.out.println("enter a number");
n = s.nextInt();
for(i=1;i<=n;i++)
{
fact = fact * i;
}
System.out.println("The factorial of the number is: "+fact);
}
}
