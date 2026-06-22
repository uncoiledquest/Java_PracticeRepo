package Java_RoadMap.Phase1_ProgrammingFundamentals.A_Variables_DataTypes;

/* 
Input radius of a circle and print:

Diameter
Circumference
Area

Use double.
 */
import java.util.Scanner;

public class PQ2 {
        static Scanner sc= new Scanner(System.in);
    public static void main(String[] args){

        System.out.print("Enter Radius of the circle: ");

        double r = sc.nextDouble();
        double area = (Math.PI)*r*r;
        double circum= 2*(Math.PI)*r;
        double dia= 2*r;

        System.out.printf("Diameter of circle is: %.2f", dia);
        System.out.println();
        System.out.printf("Area of the circle is: %.2f",area);
        System.out.println();
        System.out.printf("Circumference of the circle is: %.2f", circum);
    }
}
