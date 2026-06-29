package Java_RoadMap.Phase1_ProgrammingFundamentals.D_Enums;
import java.util.Scanner;


public class D1_CheckingLogginStats {
    static Scanner sc = new Scanner(System.in);

    static LogginStatus Status(int i) {
        if (i == 1) {
            return LogginStatus.INACTIVE;
        } else if (i == 2) {
            return LogginStatus.ACTIVE;
        } else if (i == 3) {
            return LogginStatus.TAKING_TIME;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {

        System.out.print("Enter Choice: ");
        int i = sc.nextInt();
        LogginStatus stat = Status(i);

        if (stat == LogginStatus.INACTIVE) {
            System.out.println("Person Is Currntly Inactive");
        } else if (stat == LogginStatus.ACTIVE) {
            System.out.println("Person is found Active");
        } else if (stat == LogginStatus.TAKING_TIME) {
            System.out.println("Login Process in Progress");
        } else {
            System.out.println("Invalid Choice");
        }
        System.out.println();
        for (LogginStatus j : LogginStatus.values()){
            System.out.println(j);
        }

    }
}

