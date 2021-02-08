import java.util.Scanner;

public class ExceptionsLec {
    public static void main(String[] args) {
        System.out.println("Do I run? A");
        int[] numbers = {1, 2, 3};

        try {
            System.out.println(numbers[999]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("The array is shorter than 999");
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("This will always run.");
        }

        System.out.println("Do I run? B");

        try {
            System.out.println("getIndentationPreference() = " + getIndentationPreference());
        } catch (Exception e) {
            e.printStackTrace();
            //rollBack(); if I was sending money
        }

    }

    public static String getIndentationPreference() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("What type of indentation do you prefer?");
        String indentationPreference = sc.nextLine();

        if (indentationPreference.equals("tabs")) {
            throw new Exception("Spaces are superior!");
        }

        return indentationPreference;
    }

}
