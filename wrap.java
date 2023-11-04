import java.util.Scanner;
public class wrap{
public static void main(String[]args){
Scanner sc=new Scanner (System.in);
System.out.println("ENTER DATA");
int num=sc.nextInt();
Integer wrappedNum=num;
System.out.println("Wrapped num :"+wrappedNum);
int unwrappedNum=wrappedNum;
System.out.println("UnwrappedNum :"+unwrappedNum);
sc.close();
}
}



