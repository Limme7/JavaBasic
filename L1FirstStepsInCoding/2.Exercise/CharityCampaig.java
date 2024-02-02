package FirstStepsInCoding.Lab.Exercises;

import java.util.Scanner;

public class CharityCampaig {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        int chefs = Integer.parseInt(scan.nextLine());
        int cakeNum = Integer.parseInt(scan.nextLine());
        int wafflesNum = Integer.parseInt(scan.nextLine());
        int pancakesNum = Integer.parseInt(scan.nextLine());

        double cakePrice = 45;
        double wafflePrice = 5.80;
        double pancakesPrice = 3.20;

        double sumPerDay = (cakePrice * cakeNum + wafflePrice * wafflesNum + pancakesPrice *pancakesNum) * chefs;
        double totalSum = sumPerDay * days;
        totalSum = totalSum - totalSum / 8;

        System.out.printf("%.2f",totalSum);



    }
}
