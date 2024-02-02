package FirstStepsInCoding.Lab.Exercises;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pages = Integer.parseInt(scanner.nextLine());
        int pagesPerHr = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int totalTime  = pages / pagesPerHr;
        totalTime  = totalTime / days;

        System.out.println(totalTime);
    }
}
