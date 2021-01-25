import java.util.Scanner;

public class StringsLec {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstName = "Fer";
        int age = 30;
        Integer numOfStudent = 123;

        System.out.println("What's your name?");
        firstName = sc.nextLine();

        //!firstName.equals("Fer") not equals
        if(firstName.equals("Fer")){
            System.out.println("firstName is Fer");
        } else {
            System.out.println("firstName is not Fer");
        }

        System.out.println("What's your email?");
        if(sc.nextLine().equalsIgnoreCase("fer@codeup.com")){
            System.out.println("You're an admin");
        }

        System.out.println("Your name is : " + firstName);

    }

}
