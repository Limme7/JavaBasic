package NestedLoops.Lab;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int first = 1; first <=10 ; first++) {
            for (int secound = 1; secound <=10 ; secound++) {

                int finish = first * secound;
                System.out.printf("%d * %d = %d%n", first,secound,finish);
            }
            
        }
    }
}
