package RegularExam;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        String gender = scanner.nextLine();
        double years = 0;
        double monthsHuman = 0;
        double monthsCat = 0;


        if(type.equals("British Shorthair")){
            if (gender.equals("m")){
                years = 13;
                monthsHuman = years * 12;
                monthsCat = monthsHuman /6;
                System.out.printf("%.0f cat months", Math.floor(monthsCat));

            }else if (gender.equals("f")){
                years = 14;
                monthsHuman = years * 12;
                monthsCat = monthsHuman /6;
                System.out.printf("%.0f cat months", Math.floor(monthsCat));
            }

        }else if(type.equals("Siamese")){
            if (gender.equals("m")){
                years = 15;
                monthsHuman = years * 12;
                monthsCat = monthsHuman /6;
                System.out.printf("%.0f cat months", Math.floor(monthsCat));

            }else if (gender.equals("f")){
                years = 16;
                monthsHuman = years * 12;
                monthsCat = monthsHuman /6;
                System.out.printf("%.0f cat months", Math.floor(monthsCat));
            }


        }else if (type.equals("Persian")){
            if (gender.equals("m")){
                years = 14;
                monthsHuman = years * 12;
                monthsCat = monthsHuman /6;
                System.out.printf("%.0f cat months", Math.floor(monthsCat));

            }else if (gender.equals("f")){
                years = 15;
                monthsHuman = years * 12;
                monthsCat = monthsHuman /6;
                System.out.printf("%.0f cat months", Math.floor(monthsCat));
            }

        }else if (type.equals("Ragdoll")){
            if (gender.equals("m")){
                years = 16;
                monthsHuman = years * 12;
                monthsCat = monthsHuman /6;
                System.out.printf("%.0f cat months", Math.floor(monthsCat));

            }else if (gender.equals("f")){
                years = 17;
                monthsHuman = years * 12;
                monthsCat = monthsHuman /6;
                System.out.printf("%.0f cat months", Math.floor(monthsCat));
            }

        }else if (type.equals("American Shorthair")){
            if (gender.equals("m")){
                years = 12;
                monthsHuman = years * 12;
                monthsCat = monthsHuman /6;
                System.out.printf("%.0f cat months", Math.floor(monthsCat));

            }else if (gender.equals("f")){
                years = 13;
                monthsHuman = years * 12;
                monthsCat = monthsHuman /6;
                System.out.printf("%.0f cat months", Math.floor(monthsCat));
            }

        }else if (type.equals("Siberian")){
            if (gender.equals("m")){
                years = 11;
                monthsHuman = years * 12;
                monthsCat = monthsHuman /6;
                System.out.printf("%.0f cat months", Math.floor(monthsCat));

            }else if (gender.equals("f")){
                years = 12;
                monthsHuman = years * 12;
                monthsCat = monthsHuman /6;
                System.out.printf("%.0f cat months", Math.floor(monthsCat));
            }

        }else{
            System.out.printf("%s is invalid cat!", type);
        }
    }
}
