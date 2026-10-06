import java.util.Scanner;
class FindMaxInArray{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
System.out.println("Enter array size");
int N=scan.nextInt();
int[] arr=new int[N];
for(int i=0;i<arr.length;i++){
arr[i]=scan.nextInt();
}

int max=arr[0];
for(int i=1;i<arr.length;i++){
if(arr[i]>max){
max=arr[i];
}

}
System.out.println("Max value is:" +max);
}
}