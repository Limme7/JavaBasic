package PreExam;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double fat = Double.parseDouble(scanner.nextLine());
        double proteins = Double.parseDouble(scanner.nextLine());
        double carbohydrate = Double.parseDouble(scanner.nextLine());
        int totalCalories= Integer.parseInt(scanner.nextLine());
        int percentWater = Integer.parseInt(scanner.nextLine());

        double totalGramsFromFat = (fat/100 * totalCalories) / 9;
        double totalGramsFromProtein = (proteins/100 * totalCalories )/4;
        double totalGramsFromCarbohydrate = (carbohydrate/100 * totalCalories)/4;

        double totalWeightFood = totalGramsFromFat + totalGramsFromProtein + totalGramsFromCarbohydrate;
        double caloriesPerGram = totalCalories / totalWeightFood;

        double finalPercent =1.0* (100 - percentWater)/100;

        double finalResult = finalPercent * caloriesPerGram;
        System.out.printf("%.4f", finalResult);

    }
}
