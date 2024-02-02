package FirstStepsInCoding.Lab.Exercises.More;

import java.util.Scanner;

public class WeatherForecastPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double temperature = Double.parseDouble(scanner.nextLine());

        if (temperature >= 26.00){

            System.out.println("Hot");
        }else if (temperature>=20.1){

            System.out.println("Warm");
        }else if(temperature>=15.00){

            System.out.println("Mild");
        }else if (temperature>=12.00){
            System.out.println("Cool");

        }else if (temperature>=8.00){
            System.out.println("Cold");

        }else{
            System.out.println("unknown");

        }
    }
}
