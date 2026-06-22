package Java_RoadMap.Phase1_ProgrammingFundamentals.A_Variables_DataTypes;

/* 
Take two integers a and b.

Without using:
third variable
arrays
collections

Swap them and verify by printing before and after values.
 */
public class PQ3 {
    public static void main(String[] args){
        int a= 5;
        int b= 6;
        System.out.println("A: "+a);
        System.out.println("B: "+b);
        a = a + b - (b=a);

        System.out.println("A: "+a);
        System.out.println("B: "+b);

        // The problem with this swapping with temporary variable is that it can cause overflowing.
        // # An integer has a definite size, to swap, we use mathematical addition before subtracting it with the same.
        // During that addition, if the Number if the size, 2 * 10^31, adding anything to it would cause overflow and 
        // Code will not work.
        // Thus, this is the only restriction of this code.
    }
}
