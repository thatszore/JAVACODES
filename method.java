public class method{
public static void main(String[]args){
Calculator cal=new Calculator();
System.out.println("METHOD OVERLOADING");
System.out.println("ADDING 2 VAR :"+cal.add(5,10));
System.out.println("ADDING 3 VAR :"+cal.add(5,10,45));
System.out.println("ADDING 3 VAR :"+cal.add(2.4,5.6,7.9));
}
}
class Calculator{
int add(int a,int b){
return(a+b);
}
int add(int a ,int b,int c){
return(a+b+c);
}
double add(double a ,double b,double c){
return(a+b+c);
}
}