package FirstStepsInCoding.Lab.Exercises.More;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double kgVeg = Double.parseDouble(scanner.nextLine());
        double kgFruit = Double.parseDouble(scanner.nextLine());
        double totalKgVeg = Double.parseDouble(scanner.nextLine());
        double totalKgFruit = Double.parseDouble(scanner.nextLine());

        double resVeg = kgVeg * totalKgVeg;
        double resFruit = kgFruit * totalKgFruit;

        double result = resFruit + resVeg;

        System.out.printf("%.2f",result/1.94);
    }
}
