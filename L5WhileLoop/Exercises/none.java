package WhileLoop.Exercises;

import java.util.Scanner;

public class none {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        double totalSum =0;
        while (!input.equals("Movie time!")){
            int personsEntering = Integer.parseInt(input);
            capacity-=personsEntering;

            if(capacity<0){
                break;
            }

            if (personsEntering % 3 == 0){
                totalSum += (personsEntering * 5) - 5;
            }else{
                totalSum += personsEntering *5;
            }
            input= scanner.nextLine();

        }

        if(capacity>0 || capacity == 0 ){
            System.out.printf("There are %d seats left in the cinema.%n",capacity);
        }else {
            System.out.printf("The cinema is full.%n");
        }
        System.out.printf("Cinema income - %.0f lv.", totalSum);
    }
}
