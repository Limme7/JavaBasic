package PreExam;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        double totalMeters = 5364;
        double days = 5;

        while (!input.equals("END")) {
            for (int i = 0; i < days; i++) {
                if (days > 5){
                    break;
                }

            }
            String restOrNo = input;
            int meters = Integer.parseInt(scanner.nextLine());

            totalMeters += meters;


            if (days > 5 || totalMeters > 8848) {
                break;

            }


            input = scanner.nextLine();

        }

        if (totalMeters >= 8848) {
            System.out.printf("Goal reached for %.0f days!", days);
        }else {
            System.out.printf("Failed!%n%.0f", totalMeters);


        }

    }
}

