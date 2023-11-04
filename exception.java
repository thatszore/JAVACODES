class Main{
public static void main(String[]args){
try{
int divide=5/0;
System.out.println("REST IN TRY");
}
catch(ArithmeticException e){
System.out.println("ARITHEMATIC EXCEPTION"+e.getMessage());
}
}
}
