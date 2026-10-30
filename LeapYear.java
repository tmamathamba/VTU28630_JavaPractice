import java.util.Scanner;
class LeapYear{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the Val1:");
int a=sc.nextInt();
if(a%4==0){
System.out.println("Leapyear");
}else{
System.out.println("Not Leapyear ");
}
}
}