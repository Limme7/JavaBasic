package FirstStepsInCoding.Lab.Exercises;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double depositSum = Double.parseDouble(scan.nextLine());
        int months = Integer.parseInt(scan.nextLine());
                double interestRate = Double.parseDouble(scan.nextLine());
                        double sumPerMonth = ((depositSum * (interestRate / 100)) / 12);
                        double sum = depositSum + months * sumPerMonth;
                        System.out.println(sum);

    }
}
