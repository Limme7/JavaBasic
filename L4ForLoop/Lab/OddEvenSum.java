package ForLoop.Lab;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int evenSum = 0 ;
        int oddSum = 0 ;

        for (int i = 1; i <= n ; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            if (i % 2 ==0 ){
                evenSum+= currentNum;

            }else{
                oddSum+=currentNum;
            }

        }
        if (evenSum== oddSum) {
            System.out.printf("Yes%nSum = %d%n", evenSum);
        }else {
            System.out.printf("No%nDiff = %d%n", Math.abs(evenSum - oddSum));
        }
    }
}
