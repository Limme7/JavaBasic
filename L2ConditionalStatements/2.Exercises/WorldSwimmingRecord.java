package ConditionalStatements.Lab.Exercises;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeForMeter = Double.parseDouble(scanner.nextLine());

        //Иван трябва да преплува 1500 м.:  1500 * 20 = 30000 сек.

        double addedTIme = Math.floor(distance /15) * 12.5;
        double totalTime = distance * timeForMeter + addedTIme;

        if (record > totalTime){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }else{
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTime - record);

        }




    }
}
