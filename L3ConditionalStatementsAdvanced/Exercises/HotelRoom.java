package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        String pack = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if (movie.equals("John Wick")){
            if (pack.equals("Drink")){
                price=12;

            }else if (pack.equals("Popcorn")){
                price=15;

            }else if (pack.equals("Menu")){
                price=19;
            }
        }else if (movie.equals("Star Wars")){

            if (pack.equals("Drink")){
                price=18;

            }else if (pack.equals("Popcorn")){
                price=25;

            }else if (pack.equals("Menu")){
                price=30;
            }
            if (tickets >=4) {
                price = price  * 0.70;
            }
        }else if (movie.equals("Jumanji")){
            if (pack.equals("Drink")){
                price=9;

            }else if (pack.equals("Popcorn")){
                price=11;

            }else if (pack.equals("Menu")){
                price=14;
            }
            if (tickets == 2){
                price = price * 0.85;
            }
        }

        double totalPrice = tickets * price;
        System.out.printf("Your bill is %.2f leva.", totalPrice);


    }
}
