import java.util.Scanner;
public class SquareArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();                                                     
        int[] arr=new int[a];
        int b=sc.nextInt();

            
        System.out.println("Sum of elements:" );
        int Mul=1;
        
        for(int i=0;i<b;i++){
            arr[i]=sc.nextInt();
            Mul=Mul*a;
            System.out.println(Mul);
        }
        
   
    }

        
}
    

