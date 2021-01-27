import java.util.Scanner;

public class MethodsExercises {
    public static double add(double num1, double num2) {
        return num1 + num2;
    }
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Your answer is undefined (tried to divide by 0)");
            return 0.0;
        }

        return num1 / num2;
    }
    public static double modulus(double num1, double num2) {
        return num1 % num2;
    }

    // Get a number within a range
    public static int getInteger(int min, int max) {
        // return a random number between min and max
        // use Java version of Math.random()
        // ask for a number from the Scanner, then make sure it's between these two min/max
        Scanner input = new Scanner(System.in); // read input from user
        System.out.println("Enter a number " + min + " and " + max);
        int userInput = input.nextInt();
        if (userInput >= min && userInput <= max) { // number was within the bounds
            System.out.println("Great job - you chose a valid number!");
            return userInput;
        } else {
            System.out.println("That number was not within the range of " + min + " - " + max);
            System.out.println("Please try again!");
            return getInteger(min,max);
        }
    }

    public static void getFactorial(int min, int max) {
        int factBase = getInteger(min, max); // i.e. now we have a num between 1 - 10
        double factorial = 1;
        for (int i = 1; i <= factBase; i++) {
            // display  1! = 1
            //          2! = 1 x 2           = 2
            //          3! = 1 x 2 x 3       = 6
            //          4! = 1 x 2 x 3 x 4   = 24
            factorial *= i;
            System.out.println(i + "! = " + getVisualFactorial(i) + " = " + factorial);
        }

    }

    public static String getVisualFactorial(int base) {
        // display  1! = 1
        //          2! = 1 x 2           = 2
        //          3! = 1 x 2 x 3       = 6
        //          4! = 1 x 2 x 3 x 4   = 24
        String visualFact = "1";
        // If the number sent in is 1, we don't need to do any string concatenation
        if(base == 1) {
            return visualFact;
        }
        // build our visual string
        for (int i = 2; i <= base; i++) {
            visualFact = visualFact + " x " + i;
        }
        return visualFact;
    }

    public static double getHighestFactorial() {
        double factorial = 1;
        double count = 1;
        boolean keepGoing = true;
        do {
            System.out.println(count);
            double prevFactorial = factorial;
            factorial *= count;
            if (factorial < prevFactorial) {
                // this means we got Double overflow
                //  we have reached the max value
                keepGoing = false;
                return count;
            }
            count++;
        } while(keepGoing);
        return 0.0;
    }

    // Dice Game
    public static int randomWithRange(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
    public static void rollDiceGame(Scanner sc) {
        String userChoice;
        System.out.print("Please enter the number of sides for the dice: ");
        int nSides = getInteger(1, 20);
        do {
            System.out.println("You have rolled a " + randomWithRange(1, nSides) + " and a " + randomWithRange(1, nSides));
            do {
                System.out.println("Would you like to roll again? [y/n]");
                userChoice = sc.next().trim();
            } while (!userChoice.equalsIgnoreCase("y") & !userChoice.equalsIgnoreCase("n"));

        } while (!userChoice.equals("n"));
    }

    public static void main(String[] args) {
        System.out.println(add(2,2));
        System.out.println(subtract(10,6));
        System.out.println(multiply(4,8));
        System.out.println(divide(48,12));
        System.out.println(modulus(50,11));
        System.out.println(divide(48,0));

        // Test getting a number within a range
        System.out.println("The number you picked was: " + getInteger(1, 10));
        getInteger(37, 105);

        getFactorial(1, 10);
        System.out.println("The highest number we can calculate a factorial for is: " + getHighestFactorial());
    }

}
