package Oops;
import java.util.*;

public class Firstpgrm {
    public static void main(String[] args) {
        //store 5 rolls numbers
        int[] numbers = new int[5];

        //store 5 names
        String[] names = new String[5];

        //data of 5 students:{roll no,name,marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks=new float[5];

        student[] students=new student[5];

        //just declaring
        student Mamatha;
        System.out.println(Arrays.toString(students));

    }

}

//Create a class
//for every single student
class student{
       int rno;
        String name;
        float marks; 
}
    

