import java.io.*;
import java.util.Scanner;
interface area{
void rectangle();
void circle();
void square();
void triangle(); }
class raj implements area{
double pi=3.14;
int l = 10;
int b = 8;
int h = 5;
int r = 3;
public void square(){
System.out.println("area of the sqaure is: "+(l*l));
}
public void rectangle(){
System.out.println("area of the rectangle is: "+(l*b));
}
public void circle(){
System.out.println("area of the circle is: "+(pi*r*r));
}
public void triangle(){
System.out.println("area of triangle is: "+(0.5*b*h));
}
public static void main(String args[]){
raj obj = new raj();
obj.square();
obj.rectangle();
obj.circle();
obj.triangle();
}
}

