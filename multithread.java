class multithreadingdemo implements Runnable{
public void run(){
try{
System.out.println("THREAD"+Thread.currentThread().getId()+"IS RUNNING");
}
catch(Exception e){
System.out.println("EXCEPTION CATCHED");
}
}
}
public class multithread{
public static void main(String[]args){
int n=8;
for(int i=0;i<n;i++){
Thread obj=new Thread(new multithreadingdemo());
obj.start();
}
}
}
