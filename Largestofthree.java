public class Largestofthree {
    public static void main(String[] args){
        int n1=150,n2=20,n3=10;
        if(n1 >= n2 && n1  >= n3){
            System.out.println("The largest number is:"+ n1);
        }else if (n2 >= n1 && n2 >= n3){
            System.out.println("The largest number is:"+n2);
        }else{
            System.out.println("The largest number is:");
        }
    }
    
}
