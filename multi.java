class A{
void methodA(){
System.out.println("METHOD OF A");
}
}
class B extends A{
void methodB(){
System.out.println("METHOD OF B");
}
}

class C extends B{
void methodC(){
System.out.println("METHOD OF C");
}
}
public class multi{
public static void main(String[]args){
C c=new C();
c.methodA();
c.methodB();
c.methodC();
}
}



