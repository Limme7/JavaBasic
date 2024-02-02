package FirstStepsInCoding.Lab.Exercises.More;

import java.util.Scanner;

public class TrapeziodArea {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     double a = Double.parseDouble(scanner.nextLine());
     double b = Double.parseDouble(scanner.nextLine());
     double h = Double.parseDouble(scanner.nextLine());

     double result = (a+b)*h / 2;

        System.out.printf("%.2f",result);
     
    }
}
