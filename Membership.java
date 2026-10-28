import java.util.Scanner;

public class Membership {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	System.out.print("Enter the name:");
        String name=sc.nextLine();
	System.out.print("Enter the membership:");
        String member=sc.nextLine();
        System.out.println("Member Name: "+name);
        System.out.println("Selected Membership: "+member);
    }
}
