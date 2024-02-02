package ForLoop.Exercises;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameActor = scanner.nextLine();
        double pointsFromAcademy = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        boolean isNominated = false;

        for (int i = 0; i <n ; i++) {
            String judgeName = scanner.nextLine();
            double pointsJudge = Double.parseDouble(scanner.nextLine());
//Точките, които актьора получава се формират от:
// дължината на името на оценяващия умножено по точките, които дава делено на две.

            double Points = judgeName.length() * pointsJudge / 2;
            pointsFromAcademy+=Points;

                    if (pointsFromAcademy> 1250){
                        isNominated = true;
                        break;
                    }
        }
        if (isNominated){
            System.out.printf("%nCongratulations, %s got a nominee for leading role with %.1f!" , nameActor, pointsFromAcademy);

        }else{
            System.out.printf("Sorry, %s you need %.1f more!", nameActor, 1250.5 - pointsFromAcademy);
        }

    }
}
