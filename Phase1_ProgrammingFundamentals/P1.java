package Java_RoadMap.Phase1_ProgrammingFundamentals;

public class P1 {
    public static void main(String[] args) {
        for (int i=0; i<4; i++){
            for (int j = 3 - i; j > 0; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j);
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println(); 
        }     
    }
}

