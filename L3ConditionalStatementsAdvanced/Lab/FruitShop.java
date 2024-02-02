package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double priceKg = 0;


        boolean workingDay = day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") ||
                day.equals("Thursday") || day.equals("Friday");
        boolean weekend = day.equals("Saturday") || day.equals("Sunday");
        boolean flag = true;


        if (workingDay) {
            if (fruit.equals("banana")) {
                priceKg = 2.50;

            } else if (fruit.equals("apple")) {
                priceKg = 1.20;

            } else if (fruit.equals("orange")) {
                priceKg = 0.85;

            } else if (fruit.equals("grapefruit")) {
                priceKg = 1.45;

            } else if (fruit.equals("kiwi")) {
                priceKg = 2.70;

            } else if (fruit.equals("pineapple")) {
                priceKg = 5.50;

            } else if (fruit.equals("grapes")) {
                priceKg = 3.85;

            }else{
                flag=false;
            }
        } else if (weekend) {
            if (fruit.equals("banana")) {
                priceKg = 2.70;

            } else if (fruit.equals("apple")) {
                priceKg = 1.25;

            } else if (fruit.equals("orange")) {
                priceKg = 0.90;

            } else if (fruit.equals("grapefruit")) {
                priceKg = 1.60;

            } else if (fruit.equals("kiwi")) {
                priceKg = 3.00;

            } else if (fruit.equals("pineapple")) {
                priceKg = 5.60;

            } else if (fruit.equals("grapes")) {
                priceKg = 4.20;

            }else{
                flag = false;
            }
        }else{
            flag= false;

        }
        if (flag) {

            double result = quantity * priceKg;
            System.out.printf("%.2f", result);
        } else{
            System.out.println("error");
        }
    }
}
