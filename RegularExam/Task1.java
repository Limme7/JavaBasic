package RegularExam;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pricePerPage = Double.parseDouble(scanner.nextLine());
        double pricePerMainPage = Double.parseDouble(scanner.nextLine());
        int discountPercentForPaper = Integer.parseInt(scanner.nextLine());
        double salaryDesigner = Double.parseDouble(scanner.nextLine());
        int totalSumPayedFromTeam = Integer.parseInt(scanner.nextLine());

        double startingSumForPrinting = pricePerPage * 899 + pricePerMainPage * 2;
        double discount = startingSumForPrinting * discountPercentForPaper /100;
        double sumWithDiscount = startingSumForPrinting - discount;
        double sumWithDesigner = sumWithDiscount + salaryDesigner;
        double teamCover = sumWithDesigner * totalSumPayedFromTeam /100;

        double result = sumWithDesigner - teamCover;


        System.out.printf("Avtonom should pay %.2f BGN.",result);

    }
}
