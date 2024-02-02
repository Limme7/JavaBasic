package ForLoop.Exercises;

import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double oddSum = 0;
        double oddMin = Double.POSITIVE_INFINITY;
        double oddMax = Double.NEGATIVE_INFINITY;
        double evenSum = 0;
        double evenMin = Double.POSITIVE_INFINITY;
        double evenMax = Double.NEGATIVE_INFINITY;


        for (int i = 1; i <= n; i++) {
            double number = Double.parseDouble(scanner.nextLine());
            //проверка за четни
            if (i % 2 == 0) {
                evenSum += number;

                if (number < evenMin) {
                    evenMin = number;
                }
                if (number > evenMax) {
                    evenMax = number;
                }
                //Проверка за не четни
            } else {
                oddSum += number;

                if (number < oddMin) {
                    oddMin = number;
                }
                if (number > oddMax) {
                    oddMax = number;
                }
            }
        }

        System.out.printf("OddSum=%.2f,%n", oddSum);
        if (oddSum == 0) {
            System.out.printf("OddMin=No,%n" +
                    "OddMax=No,%n");
        } else {
            System.out.printf("OddMin=%.2f,%n" +
                    "OddMax=%.2f,%n", oddMin, oddMax);
        }
        System.out.printf("EvenSum=%.2f,%n", evenSum);
        if (evenSum == 0) {
            System.out.printf("EvenMin=No,%n" +
                    "EvenMax=No%n");
        } else {
            System.out.printf("EvenMin=%.2f,%n" +
                    "EvenMax=%.2f%n", evenMin, evenMax);
        }
    }
}
