package PreExam;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        double sum = 0;

        for (int i = 0; i < n; i++) {
            double evaluation = Double.parseDouble(scanner.nextLine());
            sum += evaluation;

            if (evaluation <=2.99){
                p1++;
            }else if (evaluation<=3.99){
                p2++;

            }else if (evaluation <=4.99){
                p3++;
            }else{
                p4++;
            }

        }
        System.out.printf("Top students: %.2f%%%n",p4 * 1.0 / n * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n",p3 * 1.0 / n * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n",p2 * 1.0 / n * 100);
        System.out.printf("Fail: %.2f%%%n",p1 * 1.0 / n * 100);
        System.out.printf("Average: %.2f",  sum / n);
    }
}
