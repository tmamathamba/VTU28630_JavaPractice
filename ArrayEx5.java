import java.util.Scanner;

class ArrayEx5{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
int[] arr=new int[3];
for(int i=0;i<arr.length;i++){
arr[i]=scan.nextInt();
}

System.out.println(arr[0]);
System.out.println(arr[1]);
System.out.println(arr[2]);

}
}