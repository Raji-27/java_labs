class Add{
int a,b,c;
Add(int x)
{
a = x;
b = x;
} 
Add(int a1, int b1)
{
a = a1;
b = b1; 
} 
Add(int c1,int d1, int d2) 
{
a = c1*3;
b = d1*3;
c = d2*3;
} 
void display()
{
System.out.println("solution: "+(a+b));
}
void cals()
{ 
System.out.println("solution: "+(a+b+c));
}
public static void main(String args[])
{
Add obj = new Add(1234);
Add obj2 = new Add(25,89);
Add obj3 = new Add(10,20,30);
obj.display();
obj2.display();
obj3.cals();
}
}


