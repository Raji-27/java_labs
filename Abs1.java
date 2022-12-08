abstract class phone
{
String s,city,add;
int i;
void f1()
 {
 s= "cse";
 i=12345;
 city="chennai";
 add="sathaybama";
 }
 //abstract public void dis1();
 abstract public void address();
}
public class Abs1 extends phone {
 public void address()
 {
 System.out.println(s+"\n"+i+"\n"+city+"\n "+add);
 }
 public static void main(String[] args) {
 Abs1 m1=new Abs1();
 m1.f1();
m1.address(); 
 } }