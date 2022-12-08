import java.io.*;
import java.util.Scanner;
class student
{
Scanner scan = new Scanner(System.in);
String name;
int idno,regno,year;
void details(){
System.out.println("Enter name:\n");
name = scan.nextLine();
System.out.println("Enter register no:\n");
regno = scan.nextInt();
System.out.println("enter Idno:\n");
idno= scan.nextInt();
System.out.println("Enter year(in numbers)");
year=scan.nextInt();
}
void show(){ 
System.out.println("Name: "+name);
System.out.println("Register number: "+regno);
System.out.println("mobile number: "+idno);
System.out.println("current year: "+year);
}
}
class parents extends student{
String mom,dad;
void par(){
System.out.println("enter mother's name:\n");
mom = scan.nextLine();
System.out.println("enter dad's name:\n");
dad = scan.nextLine();
}
void show(){ 
System.out.println("mother name: "+mom);
System.out.println("father name: "+dad);
}
public static void main(String args[])
{
student obj = new student();
parents obj1 = new parents(); 
obj.details();
obj1.par();
obj.show();
obj1.show();
}
}






