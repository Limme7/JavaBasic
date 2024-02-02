package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishers = Integer.parseInt(scanner.nextLine());

        double price = 0;


        switch (season)
        {
            case "Spring":
                price=3000;
                if (fishers<=6){
                    price*=0.90;
                }else if (fishers <=11){
                    price *=0.85;
                }else{
                    price*=0.75;
                }

                break;
            case "Summer":
            case "Autumn":
                price=4200;
                if (fishers<=6){
                    price*=0.90;
                }else if (fishers <=11){
                    price *=0.85;
                }else{
                    price*=0.75;
                }

                break;
            case "Winter":
                price=2600;
                if (fishers<=6){
                    price*=0.90;
                }else if (fishers <=11){
                    price *=0.85;
                }else{
                    price*=0.75;
                }

                break;
        }
               if (fishers%2==0 && !season.equals("Autumn")){
                   price *=0.95;

        }

               if (budget>=price){
                   System.out.printf("Yes! You have %.2f leva left.", budget-price);
               }else{
                   System.out.printf("Not enough money! You need %.2f leva.", price -budget);

               }

    }
}
