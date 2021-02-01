package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    String getString(){
        System.out.printf("Please enter a string: %n");

        return this.scanner.nextLine();
    }

    boolean yesNo(){
        System.out.printf("Please enter \"yes\" or \"no\": %n");

        String answer = this.scanner.nextLine();
        return (answer.toLowerCase().equals("y") ||
                answer.toLowerCase().equals("yes"));
    }

    int getInt(){
        System.out.printf("Please enter an integer: %n");
        return this.scanner.nextInt();
    }

    int getInt(int min, int max){
        while (true) {
            System.out.printf("Please enter an integer between %d and %d: %n",min,max);
            int answer = this.scanner.nextInt();
            if (answer >= min && answer <= max)
                return answer;
        }
    }

    double getDouble(){
        System.out.printf("Please enter a double: %n");
        return this.scanner.nextDouble();
    }

    double getDouble(double min, double max){
        while (true) {
            System.out.printf("Please enter a double between %f and %f: %n",min,max);
            double answer = this.scanner.nextDouble();
            if (answer >= min && answer <= max)
                return answer;
        }
    }
//    public static void main(String[] args) {
//        Input in = new Input();
//    }
}
