import java.io.*;
import java.util.*;
class jjii{
int a,b,c;
jjii(int x, int y){
a = x;
b = y;
}
}
class execute extends jjii{
execute(int x,int y, int z){
super(x,y);
c = z;
}
void show(){
System.out.println("the sum of two numbers "+a+" "+b+"is"+(a+b));
}
void display(){
System.out.println("the sum of three numbers "+a+" "+b+" "+c+"is"+(a+b+c));
}
public static void main(String args[]){
execute ob = new execute(75,25,39);
ob.show();
ob.display();
}
}

