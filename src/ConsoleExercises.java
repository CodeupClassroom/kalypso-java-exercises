import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
        double pi = 3.141592;
        System.out.printf("The value of pi is approximately %.2f.%n", pi);

        int answer;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        answer = scan.nextInt();
        System.out.printf("Your number is %d%n", answer);

        System.out.println("Please enter 3 words: ");
        String str1 = scan.next();
        String str2 = scan.next();
        String str3 = scan.next();
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println();
        scan.nextLine(); // clears the input
        System.out.println("Please enter a sentence:");
        String sentence = scan.nextLine();
        System.out.println("Here is your sentence: ");
        System.out.println(sentence);

        System.out.println("Please enter length of your classroom. (ex. 12.5)");
        double length = Double.parseDouble(scan.nextLine());
        System.out.println("Please enter width of your classroom. (ex. 14.2)");
        double width = Double.parseDouble(scan.nextLine());

        System.out.printf("Area of classroom: %.1f ft^2%n", length*width);
        System.out.printf("Perimeter of classroom: %.1f ft%n", (2*length + 2*width));
    }
}
