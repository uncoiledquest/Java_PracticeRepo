package Java_RoadMap.Phase1_ProgrammingFundamentals.C_Arrays;

import Java_RoadMap.Person;
import java.util.Scanner;

public class P1_Array{
    static Scanner sc = new Scanner(System.in);

    //Return Name Function
    public static String returnName(){
        System.out.print("Enter Name: ");
        return sc.nextLine();
    }

    //MAIN
    public static void main(String[] args){

        // Creating an Array
        Person[] people = new Person[5];
        int[] Array1 = new int[9];

        //Some Crappy method to check Array length
        System.out.println(Array1.length);

        // Name Adding in Person Array
        for (int i = 0; i < (people.length); i++){
            String n = returnName();
            people[i] = new Person(n);
        }

        // What is Stored in people[i] currently is Reference to the object or Basically the Address of the object.
        /*  people
            Index:   0      1      2      3      4
                    [1000] [2000] [null] [null] [null] */

        System.out.println(people[2].hello());
        System.out.println("Number of people Filled: " + people[1].numOfPerson());

        // Another loop implementation, Just like 'for i in x' in Python.

        for (Person i : people){
            System.out.println(i.pName());
        }

        //Another way to assign Arrays:

        final Person[] newPeep= {new Person("A"),new Person("B"), new Person("C")};

        //->Shi written 'personName' is a parameter name hint (or inlay hint) provided by IntelliJ IDEA.
        //Final: Variable Modifier -> Locks in the variable. No one can change this shi once created.

        // newPeep = null; -> Error msg: Cannot Assign Value to Final Variable.


    }
}