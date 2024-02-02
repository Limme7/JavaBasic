package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int hourArrive = Integer.parseInt(scanner.nextLine());
        int minArrive = Integer.parseInt(scanner.nextLine());

        int examTime = examHour*60 + examMinute;
        int arriveTIme = hourArrive * 60 + minArrive;

        String output = "";

        int diff=0;

        if (arriveTIme < examTime -30){
            output = "Early";
            diff= examTime - arriveTIme;
            System.out.println(output);
            if (diff < 60){
                System.out.printf("%d minutes before the start", diff);

            }else{
                int h = diff /60;
                 int m = diff % 60 ;
                System.out.printf("%d:%02d hours before the start", h,m);

            }
        }else if (arriveTIme <= examTime){
            diff = examTime - arriveTIme;
            output = "On time";
            if (diff ==0) {
                System.out.println(output);
            }else{
                System.out.println(output);
                System.out.printf("%d minutes before the start", diff);
            }


        }else{
            output = "Late";
            diff = arriveTIme - examTime;
            System.out.println(output);

            if (diff < 60){
                System.out.printf("%d minutes after the start", diff);

            }else {
                int h = diff / 60;
                int m = diff % 60;
                System.out.printf("%d:%02d hours after the start", h, m);
            }


        }
    }
}
