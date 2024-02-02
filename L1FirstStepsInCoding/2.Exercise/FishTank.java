package FirstStepsInCoding.Lab.Exercises;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = Integer.parseInt(scan.nextLine());
        int wight = Integer.parseInt(scan.nextLine());
        int heights = Integer.parseInt(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());

        double volumeCm = length * wight * heights;
        double volumeInLiters = volumeCm * 0.001;
        volumeInLiters = volumeInLiters - volumeInLiters * percent / 100;

        System.out.printf("%.2f",volumeInLiters);




    }
}
