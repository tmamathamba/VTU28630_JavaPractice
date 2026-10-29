import java.util.Scanner;

public class CgpaUsingBuiltIn {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	System.out.print("Enter the name:");
        String Name=sc.nextLine();
	System.out.print("Enter the age:");
        int Age=sc.nextInt();
	System.out.print("Enter the cgpa:");
        float CGPA=sc.nextFloat();
        float new_cgpa=(float)(Math.floor(CGPA*100))/100;
        sc.nextLine();
	System.out.print("Enter the grade:");
        char Grade=sc.next().charAt(0);
        System.out.println("Name: "+Name);
        System.out.println("Age: "+Age);
        System.out.println("CGPA: "+new_cgpa);
        System.out.println("Grade: "+Grade);
        
    }
}
