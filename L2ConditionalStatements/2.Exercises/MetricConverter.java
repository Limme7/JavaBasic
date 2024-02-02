package ConditionalStatements.Lab.Exercises;

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        String in = scanner.nextLine();
        String out = scanner.nextLine();


        // mm cm m
        if (in.equals("mm")){
            number = number / 1000;
        }else if (in.equals("cm")){
            number=number/100;

        }
        if (out.equals("mm")){
            number *= 1000;
        }else if (out.equals("cm")){
            number *= 100;

        }
        System.out.printf("%.3f", number);
    }
}
