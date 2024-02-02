package ConditionalStatements.Lab.Lab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        double area = 0;

        if(type.equals("square")){
            double side = Double.parseDouble(scanner.nextLine());
            area = side * side;


        }else if(type.equals("rectangle")){
            double leng = Double.parseDouble(scanner.nextLine());
            double wid = Double.parseDouble(scanner.nextLine());
            area = leng * wid;

        }else if(type.equals("circle")){
            double r = Double.parseDouble(scanner.nextLine());
            area = Math.PI *r*r;


        }else{
            double base = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            area = (base * height) / 2;

        }
        System.out.printf("%.3f", area);
    }
}
