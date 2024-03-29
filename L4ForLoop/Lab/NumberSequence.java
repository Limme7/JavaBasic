package ForLoop.Lab;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        for (int i = 1; i <=n ; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number > maxNum){
                maxNum= number;


            }
            if (number < minNum){
                minNum = number;

            }
        }
        System.out.println("Max number: " + maxNum);
        System.out.println("Min number: " + minNum);
    }
}
