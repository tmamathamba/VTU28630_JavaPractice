import java.util.*;
class TwoDArray{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[][] arr=new int[n][n];
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
arr[i][j]=sc.nextInt();
}
}
int pd=0;
int sd=0;
for(int i=0;i<n;i++){
pd+=arr[i][i];
sd+=arr[i][n-i-1];
}
System.out.println(pd+" "+sd);
}
}