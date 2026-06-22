package Java_RoadMap.Phase1_ProgrammingFundamentals.A_Variables_DataTypes;

/* 
Take a student's name, age, and CGPA as input and print them in a formatted sentence.
*/
import java.util.Scanner;
public class PQ1 {

    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args){

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age= sc.nextInt();

        System.out.print("Enter GPA: ");
        float gpa= sc.nextFloat();

        System.out.println();
        System.out.println(name+" is "+age+" years old and recieved a GPA of: "+gpa+"!");
    }
    
}
