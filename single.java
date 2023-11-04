class parent{
void methodP(){
System.out.println("PARENT METHOD");
}
}
class child extends parent {
void methodC(){
System.out.println("CHILD METHOD");
}
}
public class single{
public static void main(String[]args){
child c=new child();
c.methodP();
c.methodC();
}
}

