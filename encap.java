import java.util.Scanner;
public class encap{
private String data;
void setdata(String value){
data=value;
}
String getData(){
return data;
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
encap obj=new encap();
System.out.println("ENTER DATA");
obj.setdata(sc.nextLine());
System.out.println("DATA"+obj.getData());
sc.close();
}
}


