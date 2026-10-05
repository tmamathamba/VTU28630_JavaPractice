import java.util.Scanner;
class Calculator{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the num1:");
int a=sc.nextInt();
System.out.print("Enter the num2:");
int b=sc.nextInt();
System.out.print("Enter the symbol:");
String operand=sc.next();
if (operand.equals("+")){
System.out.println("a+b:" +(a+b));
}else if(operand.equals("-")){
System.out.println("a-b:"+(a-b));
}else if(operand.equals("*")){
System.out.println("a*b:"+(a*b));
}else if(operand.equals("/")){
System.out.println("a/b:"+(a/b));
}else if(operand.equals("%")){
System.out.println("a%b:"+(a%b));
}else{
System.out.println("Invalid operand");
}
}
}


