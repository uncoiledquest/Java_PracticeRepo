package Java_RoadMap.Phase1_ProgrammingFundamentals.B_BasicKeyword;

import java.util.Scanner;

import Java_RoadMap.Person;

public class P1_Modifiers {

    static Scanner sc = new Scanner(System.in);


    public static String returnName(){
        System.out.print("Enter Name: ");
        String name= sc.nextLine();
        return name;
    }

    public static void main(String[] args) {
        Person p1= new Person(returnName());
        Person p2= new Person(returnName());
        Person p3= new Person(returnName());
        System.out.print(p1.numOfPerson());

    }


}
