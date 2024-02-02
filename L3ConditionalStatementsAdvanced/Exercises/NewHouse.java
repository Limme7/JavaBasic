package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int numFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0;


        if(flowers.equalsIgnoreCase("Roses")){
            if(numFlowers>80){
                price = numFlowers *5.00;
                price=price*0.90;
            }else{
                price=numFlowers*5.00;
            }


        }else if (flowers.equalsIgnoreCase("Dahlias")){
            if (numFlowers>90){
                price = numFlowers * 3.80;
                price = price*0.85;

            }else{
                price=numFlowers*3.80;
            }


        }else if (flowers.equalsIgnoreCase("Tulips")){
            if(numFlowers > 80){
                price=numFlowers*2.80;
                price = price * 0.85;

            }else{
                price = numFlowers*2.80;
            }


        }else if (flowers.equalsIgnoreCase("Narcissus")){
            if(numFlowers<120){
                price= numFlowers*3.00;
                price = price * 1.15;
            }else{
                price= numFlowers*3.00;
            }


        }else if (flowers.equalsIgnoreCase("Gladiolus")) {
            if (numFlowers < 80) {
                price = numFlowers * 2.50;
                price = price * 1.20;

            } else {
                price = numFlowers * 2.50;

            }
        }
        if(budget >= price){
            double difference = budget - price;


            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",
                    numFlowers,flowers,difference);

        }else if (price > budget){
            double need = price-budget;
            System.out.printf("Not enough money, you need %.2f leva more.", need);
        }

    }


}

