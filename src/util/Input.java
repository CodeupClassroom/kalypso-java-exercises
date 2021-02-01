package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        return getString("Please enter a string:");
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return this.scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.printf("Please enter \"yes\" or \"no\": %n");

        String answer = this.scanner.nextLine();
        return (answer.toLowerCase().equals("y") ||
                answer.toLowerCase().equals("yes"));
    }

    public int getInt(){
        System.out.printf("Please enter an integer: %n");
        return this.scanner.nextInt();
    }

    public int getInt(int min, int max){
        while (true) {
            System.out.printf("Please enter an integer between %d and %d: %n",min,max);
            int answer = this.scanner.nextInt();
            if (answer >= min && answer <= max)
                return answer;
        }
    }

    public double getDouble(){
        System.out.printf("Please enter a double: %n");
        return this.scanner.nextDouble();
    }

    public double getDouble(double min, double max){
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
