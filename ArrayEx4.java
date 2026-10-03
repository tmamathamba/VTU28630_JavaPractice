import java.util.Scanner;
class ArrayEx4{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int[] arr=new int[3];
for(int i=0;i<arr.length;i++){
arr[i] = sc.nextInt();
}
System.out.println("Array elements are:");
for(int i=0;i<arr.length;i++){
System.out.println(arr[i]);

}
}
}
