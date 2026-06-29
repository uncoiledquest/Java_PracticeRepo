package Java_RoadMap.Phase1_ProgrammingFundamentals.B_BasicKeyword;

import java.util.Scanner;

import Java_RoadMap.Phase1_ProgrammingFundamentals.Person;

public class P1_Modifiers {

    static Scanner sc = new Scanner(System.in);


    public static String returnName(){
        System.out.print("Enter Name: ");
        String name= sc.nextLine();
        return name;
    }

    public static void main(String[] args) {

        // Using Loop to add multiple people
        Person p1=null;

        for (int i = 0; i<4; i++) p1 = new Person();

        System.out.print(p1.numOfPerson());

    }
}
