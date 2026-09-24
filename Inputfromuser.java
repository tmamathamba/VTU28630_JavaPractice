import java.lang.System;
import java.util.Scanner;

class Inputfromuser{
    public static void main(String args[]){
        Scanner john=new Scanner(System.in);
        int a = john.nextInt();
        int b = john.nextInt();
        int c = a+b;
        System.out.println("c:"+c);
    }
}
