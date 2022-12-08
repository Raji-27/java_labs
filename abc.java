import java.io.*;
import java.util.Scanner;
abstract class abc{
abstract void roi();
long accno;
double bal,interest;
Scanner s = new Scanner(System.in);
void gets(){
System.out.println("enter account number");
accno = s.nextLong();
System.out.println("enter the balance");
bal = s.nextDouble();
}
void print(){
System.out.println("ACCOUNT NO: "+accno);
System.out.println("BALANCE: "+bal);
}
}
class cba extends abc{
void roi(){
interest = 0.07;
bal = (bal+(bal*interest));
System.out.println("INTEREST: "+interest);
System.out.println("The balance after interest is "+bal);
}
public static void main(String args[]){
cba ob = new cba();
ob.gets();
ob.print();
ob.roi();
}
}
