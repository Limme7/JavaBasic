package FirstStepsInCoding.Lab.Exercises;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rent = Integer.parseInt(scanner.nextLine());

        double cake = rent * 0.2;
        double drinks = cake - (cake * 0.45);
                double anime = rent / 3.0;
             double totalSum  = rent +cake +drinks +anime;

                System.out.println(totalSum);
    }
}
