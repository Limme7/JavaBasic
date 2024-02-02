package FirstStepsInCoding.Lab.Exercises.Lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countDogs = Integer.parseInt(scanner.nextLine());
        int countAnimals = Integer.parseInt(scanner.nextLine());

        double dogsFood = countDogs * 2.50;
        double animalsFood = countAnimals * 4.00;

        double sum = dogsFood + animalsFood;

        System.out.println(sum + " lv.");


    }
}
