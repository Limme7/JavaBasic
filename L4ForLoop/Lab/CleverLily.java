package ForLoop.Lab;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double washMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int toyCount = 0;
        double sumMoney = 0;
        double currentMoney = 0;
        int countBrother = 0;

        for (int i = 1; i <=age ; i++) {
            if (i % 2 !=0){
                toyCount++;

            }else{
                countBrother++;
                currentMoney = currentMoney + 10;
                sumMoney = currentMoney + sumMoney;

            }
        }
        double allSavedMoney = (toyCount * toyPrice) + sumMoney - countBrother;
        double diff = Math.abs(allSavedMoney - washMachinePrice);
        if (allSavedMoney >= washMachinePrice ) {
            System.out.printf("Yes! %.2f",diff);
        }else{
            System.out.printf("No! %.2f",diff);


        }
    }
}
