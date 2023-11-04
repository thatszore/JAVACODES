class mythread extends Thread{
public void run(){
System.out.println("THREAD" +getName()+"IS RUNNING");
}
}
public class multithreading{
public static void main(String[]args){
mythread t1=new mythread();
mythread t2=new mythread();
mythread t3=new mythread();
t1.start();
t2.start();
t3.start();
}
}


