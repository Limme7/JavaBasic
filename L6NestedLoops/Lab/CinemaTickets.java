package NestedLoops.Lab;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("Finish")){
            String movieName = input;
            int freeSeats = Integer.parseInt(scanner.nextLine());

            int counterTickets = 0;
            String command = scanner.nextLine();
            while (!command.equals("End")){
                String typeTicket = command;
                counterTickets++;



                command= scanner.nextLine();
            }
            System.out.printf("%s - %.2d%% full.%n", movieName, counterTickets/freeSeats*100);

            input= scanner.nextLine();
        }
    }
}
