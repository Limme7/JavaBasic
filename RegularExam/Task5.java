package RegularExam;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int toy = 5;
        int sweater = 15;
        int toyCount =0;
        int sweaterCount = 0;

        while (!input.equals("Christmas")){
            int age = Integer.parseInt(input);
            if (age <= 16){
                toyCount++;

            }else{
                sweaterCount++;

            }



            input= scanner.nextLine();
        }
        System.out.printf("Number of adults: %d%n", sweaterCount);
        System.out.printf("Number of kids: %d%n", toyCount);
        System.out.printf("Money for toys: %d%n", toyCount * toy);
        System.out.printf("Money for sweaters: %d", sweaterCount * sweater);
    }
}
