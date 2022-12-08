class spoon implements Runnable{
public void run(){
for(int i=1;i<=5;i++){
try{
Thread.sleep(5000);
}
catch(Exception e){
System.out.println(e);
}
System.out.println(i);
}
}
}
class tumbler implements Runnable{
public void run(){
for(int i=1;i<=5;i++){
try{
Thread.sleep(5000);
}
catch(Exception e){
System.out.println(e);
}
System.out.println((2*i));
}
}
}
class jill{
public static void main(String args[]){
spoon obj = new spoon();
tumbler ob = new tumbler();
Thread t1 = new Thread(obj);
Thread t2 = new Thread(ob);
t1.start();
t2.start();
}
}
