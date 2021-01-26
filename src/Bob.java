import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while(true){

            System.out.println("What will you say to Bob? (type exit if you want to finish this exec)");
            String userResponse = scan.nextLine().trim();

            if(userResponse.endsWith("?")){
                System.out.println("Sure");
            } else if (userResponse.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userResponse.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else if (userResponse.toLowerCase().equals("exit")){
                System.out.println("Good bye!");
                break;
            } else {
                System.out.println("Whatever");
            }
        }

    }
}
