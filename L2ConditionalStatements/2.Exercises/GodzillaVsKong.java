package ConditionalStatements.Lab.Exercises;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statist = Integer.parseInt(scanner.nextLine());
        double priceCloth = Double.parseDouble(scanner.nextLine());
//Декорът за филма е на стойност 10% от бюджета.
        double decorSum = budget * 0.1;
//При повече от 150 статиста,  има отстъпка за облеклото на стойност 10%
        if (statist > 150){
            priceCloth *= 0.9;
        }

        double totalSum = decorSum + statist * priceCloth;

        double money = 0;
        if (totalSum > budget){
            System.out.printf("Not enough money!\n" +
                    "Wingard needs %.2f leva more.", totalSum - budget);
        }else if (totalSum <= budget){
            System.out.printf("Action!\n" +
                            "Wingard starts filming with %.2f leva left.", budget-totalSum);


        }
    }
}
