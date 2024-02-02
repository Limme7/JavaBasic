package ConditionalStatements.Lab.Lab;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int dollsCount = Integer.parseInt(scanner.nextLine());
        int teddyCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int trucksCount = Integer.parseInt(scanner.nextLine());



        double sum = (puzzleCount * 2.60) + (dollsCount * 3) + (teddyCount * 4.10) + (minionsCount * 8.20) +
                (trucksCount * 2);
        int countAll = puzzleCount + dollsCount +teddyCount +minionsCount+trucksCount;
        if (countAll >= 50){
            sum = sum * 0.75;

        }
        sum = sum * 0.90;
        if (sum >= tripPrice){
            System.out.printf("Yes! %.2f lv left.", sum - tripPrice);
        }else{
            System.out.printf("Not enough money! %.2f lv needed.", tripPrice - sum);
        }





    }
}
