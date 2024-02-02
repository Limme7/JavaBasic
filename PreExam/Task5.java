package PreExam;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        double totalMeters = 5364;
        double days = 1;

        while (!input.equals("END")){
            String restOrNo = input;
            int meters = Integer.parseInt(scanner.nextLine());
            totalMeters+=meters;

            if (restOrNo.equals("Yes")){
                days++;
            }else if (restOrNo.equals("No")){
                days=days;
            }



            if (totalMeters >= 8848) {
                break;
            }else if (days >= 5 || totalMeters > 8848){
                break;
            }


            input= scanner.nextLine();


        }


        if (days >= 5 || totalMeters < 8848){
            System.out.printf("%nFailed!%n%.0f", totalMeters);


        }else if (totalMeters >= 8848){
            System.out.printf("Goal reached for %.0f days!", days);
        }

    }
}