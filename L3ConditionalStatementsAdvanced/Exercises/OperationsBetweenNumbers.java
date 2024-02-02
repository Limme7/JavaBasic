package ConditionalStatementsAdvanced.Exercises;

import java.io.Console;
import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();
        double sum = 0;

        if (symbol.equals("+")) {
            sum = N1 + N2;
            if (sum % 2 == 0) {
                System.out.printf("%d + %d = %.0f - even", N1, N2, sum);
            } else if (sum % 2 != 0) {
                System.out.printf("%d + %d = %.0f - odd", N1, N2, sum);

            }

        } else if (symbol.equals("-")) {
            sum = N1 - N2;
            if (sum % 2 == 0) {
                System.out.printf("%d - %d = %.0f - even", N1, N2, sum);
            } else if (sum % 2 != 0) {
                System.out.printf("%d - %d = %.0f - odd", N1, N2, sum);
            }

        } else if (symbol.equals("*")) {
                sum = N1 * N2;
                if (sum % 2 == 0) {
                    System.out.printf("%d * %d = %.0f - even", N1, N2, sum);
                } else if (sum % 2 != 0) {
                    System.out.printf("%d * %d = %.0f - odd", N1, N2, sum);
                }


        }    else if (symbol.equals("/")){
            if (N2 !=0 ){
                sum = (double) N1 / N2;
                System.out.printf("%d / %d = %.2f", N1,N2,sum);
            }else {
                System.out.printf("Cannot divide %d by zero", N1);
            }


        }else if (symbol.equals("%")){
            if (N2 != 0){
                sum = (double) N1 % N2;
                System.out.printf("%d %% %d = %.0f", N1,N2,sum);
            }else{
                System.out.printf("Cannot divide %d by zero", N1);

            }

        }
    }
}
