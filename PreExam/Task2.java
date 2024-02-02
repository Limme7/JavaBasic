package PreExam;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceMaidenParty = Double.parseDouble(scanner.nextLine());
        int loveLetters = Integer.parseInt(scanner.nextLine());
        int waxRoses = Integer.parseInt(scanner.nextLine());
        int keyChains = Integer.parseInt(scanner.nextLine());
        int caricatures = Integer.parseInt(scanner.nextLine());
        int luckySurprise = Integer.parseInt(scanner.nextLine());

        double sumLoveLetters = loveLetters * 0.60;
        double sumWaxRoses = waxRoses * 7.20;
        double sumKeyCains = keyChains * 3.60;
        double sumCaricatures = caricatures * 18.20;
        double sumLuckySurprises = luckySurprise * 22.00;

        double totalOrders = loveLetters + waxRoses + keyChains + caricatures + luckySurprise;
        double sumWon = sumLoveLetters + sumWaxRoses + sumKeyCains + sumCaricatures + sumLuckySurprises;
        double finalPrice = 0;
        double hosting = 0;
        double left = 0;

        if (totalOrders >= 25) {
            finalPrice = sumWon * 0.65;

        } else {
            finalPrice = sumWon;
        }
        hosting = finalPrice * 0.90;
        left = hosting - priceMaidenParty;
        if (left > priceMaidenParty) {
            System.out.printf("Yes! %.2f lv left.", left);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", priceMaidenParty - hosting);
        }


    }
    }

