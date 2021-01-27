import java.util.Scanner;

public class StringsLec {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstName = "Fer";
        int age = 30;
        Integer numOfStudent = 123;

//        System.out.println("What's your name?");
//        firstName = sc.nextLine();

        //!firstName.equals("Fer") not equals
//        if(firstName.equals("Fer")){
//            System.out.println("firstName is Fer");
//        } else {
//            System.out.println("firstName is not Fer");
//        }

        System.out.println("What's your email? ");
        String email = sc.nextLine();
        email = email.replace(' ', '_');
        System.out.println("email.length() = " + email.length());

        System.out.println("index of @ " + email.indexOf("@"));
        // System.out.println("index of @ " + email.indexOf("@@")); returned a -1

        System.out.println("indexOf of n " + email.indexOf("n"));
        System.out.println("lastIndexOf of n " + email.lastIndexOf("n"));

        System.out.println("char at " +  email.charAt(3)); // returns the @ on fer@...

        for(int x = 0; x < email.length(); x++){
            System.out.println("email.charAt(x) = " + email.charAt(x));
        }

        if(email.equalsIgnoreCase("fer@codeup.com")){
            System.out.println("You're an admin");
        }

        // to check if you work at the company
        if(email.toLowerCase().endsWith("codeup.com")){
            System.out.println("Welcome co-worker");
        }

        System.out.println("Your name is : " + firstName);

        String domain = email.substring(email.indexOf("@") + 1);
//         String domain = email.substring(email.indexOf("@") + 1, email.length());
        System.out.println("domain = " + domain);

    }

}
