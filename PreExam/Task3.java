package PreExam;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int daysStay = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String evaluation = scanner.nextLine();
        double sum = 0;
        int nights = daysStay - 1;


        if(type.equals("room for one person")){
            sum = nights * 18.00;


        }else if (type.equals("apartment")){
            sum = nights * 25.00;

            if (daysStay < 10){
                sum = sum * 0.70;

            }else if (daysStay < 15){
                sum = sum * 0.65;
            }else{
                sum = sum * 0.50;
            }

        }else if (type.equals("president apartment")){
            sum = nights * 35.00;

            if (daysStay < 10){
                sum = sum * 0.90;

            }else if (daysStay < 15){
                sum = sum * 0.85;
            }else{
                sum = sum * 0.80;
            }


        }
        if (evaluation.equals("positive")) {
            sum = sum * 1.25;
        }else{
            sum = sum* 0.90;
        }
        System.out.printf("%.2f", sum);
    }
}
