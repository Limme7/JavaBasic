package ForLoop.Exercises;

import java.util.Scanner;

public class sad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String serialName = scanner.nextLine();
        double episodeLength = Double.parseDouble(scanner.nextLine());
        double restLength = Double.parseDouble(scanner.nextLine());

        double timeLunch = restLength * 1/8;
        double timeBreath = restLength * 1/4;
        double realTimeLeft = restLength - timeLunch - timeBreath;
        double leftTime = realTimeLeft - episodeLength;

        if(realTimeLeft >= episodeLength){
            realTimeLeft=episodeLength;
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", serialName, Math.ceil(leftTime));

        }
        if(realTimeLeft<episodeLength){
            double noleftTime = episodeLength - realTimeLeft;
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", serialName, Math.ceil(noleftTime));

        }
    }
}
