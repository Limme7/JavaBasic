package ConditionalStatements.Lab.Exercises;

import java.util.Scanner;

public class TimeMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int hour = Integer.parseInt(scanner.nextLine());
         int min = Integer.parseInt(scanner.nextLine());

         int totalMin = hour * 60 + min + 15;

         int finalHour = totalMin / 60;
         int finalMin = totalMin % 60;

         if (finalHour >= 24){
             finalHour -= 24;
             System.out.printf("%d:%02d", finalHour, finalMin);

         }else if (finalMin < 10){
             System.out.printf("%d:0%d", finalHour, finalMin);

         }else {
             System.out.printf("%d:%d", finalHour, finalMin);}



    }
}
