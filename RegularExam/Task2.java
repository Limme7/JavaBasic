package RegularExam;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int plannedProduction = Integer.parseInt(scanner.nextLine());
        int numberEmployee = Integer.parseInt(scanner.nextLine());
        int workDays = Integer.parseInt(scanner.nextLine());

        double totalWorkingHours = numberEmployee * workDays * 8;
        double production = Math.floor(totalWorkingHours / 3);
        double result = 0;
        double winOrLose = 0;

        if (plannedProduction > production){
            result = plannedProduction - production;
            winOrLose = result * 110.10;
            System.out.printf("Losses: -> %.2f BGN", winOrLose);
        }else{
            result =  production - plannedProduction;
            winOrLose = result * 110.10;
            System.out.printf("Profit: -> %.2f BGN", winOrLose);
        }
    }
}
