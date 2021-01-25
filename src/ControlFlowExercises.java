import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15) {
//            // output current i
//            System.out.print(i);
//            System.out.print(' ');
//            // increment i
//            i++;
//        }

//        int j = 0;
//        do {
//            System.out.println(j);
//            j += 2;
//        } while (j <= 100);
//        int k = 100;
//        do {
//            System.out.println(k);
//            k -= 5;
//        } while (k >= -10);

//        int n = 0;
//        long m = 2;
//        do {
//            System.out.println(m);
//            m *= m;
////            n++;
//        } while (m < 1000000);
//        } while (n <5);

        // for loops
//        for (int i = 5;i <= 15;i++) {
//            // output current i
//            System.out.print(i);
//            System.out.print(' ');
//        }

//        for (int j = 0;j <= 100;j+=2) {
//            System.out.println(j);
//        }
//        for (int k = 100; k>=-10;k-=5) {
//            System.out.println(k);
//        }

//        for (long m = 2; m < 1000000; m*=m) {
//            System.out.println(m);
//        }

        Scanner scanner = new Scanner(System.in);
//        boolean userSaysContinue = false;
//        do {
//            System.out.print("What number would you like to go up to? ");
//            int input = scanner.nextInt();
//
//            System.out.println("\nHere is your table!\n");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for (int p = 1; p <= input; p++) {
//                System.out.printf("%-6d | %-7d | %-5d%n", p, p * p, p * p * p);
//            }
//            System.out.println();
//            System.out.println("Do you want to continue? (true/false)");
//            userSaysContinue = scanner.nextBoolean();
//        } while (userSaysContinue);

        boolean userWantsToContinue = false;
        do {
//            userWantsToContinue = false;
            System.out.println("\nWhat is the numerical grade? (0 to 100)");
            int grade = scanner.nextInt();

            if (grade >= 88 && grade <= 100) {
                System.out.println("A");
            } else if (grade >= 80 && grade <= 87) {
                System.out.println("B");
            } else if (grade >= 67 && grade <= 79) {
                System.out.println("C");
            } else if (grade >= 60 && grade <= 66) {
                System.out.println("D");
            } else if (grade >= 0 && grade <= 59) {
                System.out.println("F");
            } else {
                System.out.println("Invalid Number");
            }

            System.out.print("Would you like to continue (y/n)?");
            String userResponse = scanner.next();
            userWantsToContinue = (!userResponse.equalsIgnoreCase("y"));
        } while (userWantsToContinue);
    }
}
