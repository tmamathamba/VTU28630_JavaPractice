import java.util.Scanner;
class Nestedif{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       /* boolean kfc = true;
        boolean chicken = true;
        boolean pepsi=true;
        if(kfc){
            System.out.println("Enter into kfc");
            if(chicken){
                System.out.println("Eating chicken");
                if(pepsi){
                    System.out.print("Drinking pepsi");
                }
            }
        }*/

       System.out.print("Enter the salary:");
       int salary=sc.nextInt();
       System.out.print("Enter the age:");
       int age=sc.nextInt();
       if(salary>=20000 || age<=25){
        System.out.println("Eligible");
        System.out.print("How much do you need for a loan?");
        int loan=sc.nextInt();

       if(loan <=50000){
        System.out.println("Eligible for loan");
       }else{
        System.out.println("Max amount is 50000");
       }
       }else{
        System.out.println("Not eligible");
       }

    }
}