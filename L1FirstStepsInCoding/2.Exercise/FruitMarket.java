package FirstStepsInCoding.Lab.Exercises;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double strawberriesPrice = Double.parseDouble(scan.nextLine());
        double bananasKg = Double.parseDouble(scan.nextLine());
        double orangeKg = Double.parseDouble(scan.nextLine());
        double raspberriesKg = Double.parseDouble(scan.nextLine());
        double strawberriesKg = Double.parseDouble(scan.nextLine());

        double raspberriesPrice = strawberriesPrice * 0.5;
        double orangePrice = raspberriesPrice * 0.6;
        double bananasPrice = raspberriesPrice * 0.2;

        double totalSum = raspberriesKg * raspberriesPrice + orangeKg * orangePrice +
                bananasPrice * bananasKg + strawberriesKg * strawberriesPrice;




                System.out.printf("%.2f",totalSum);


    }
}
