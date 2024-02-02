package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
         String product = scanner.nextLine();
         String town = scanner.nextLine();
         double quantity = Double.parseDouble(scanner.nextLine());
         double amount =0;


         if (town.equals("Sofia")) {
             if (product.equals("coffee")){
                 amount = 0.50;


             }else if (product.equals("water")){
                 amount = 0.80;

             }else if (product.equals("beer")) {
                 amount =1.20;

             }else if (product.equals("sweets")){
                 amount = 1.45;

             }else if (product.equals("peanuts")){
                 amount =1.60;

             }



         }else if (town.equals("Plovdiv")){

             if (product.equals("coffee")){
                 amount =0.40;


             }else if (product.equals("water")){
                 amount =0.70;

             }else if (product.equals("beer")) {
                 amount =1.15;

             }else if (product.equals("sweets")){
                 amount =1.30;

             }else if (product.equals("peanuts")){
                 amount =1.50;

             }


         }else if (town.equals("Varna")){

             if (product.equals("coffee")){
                 amount =0.45;


             }else if (product.equals("water")){
                 amount =0.70;

             }else if (product.equals("beer")) {
                 amount =1.10;

             }else if (product.equals("sweets")){
                 amount =1.35;

             }else if (product.equals("peanuts")){
                 amount =1.55;

             }

         }
         double result = quantity * amount;
        System.out.println(result);

         }

    }

