package util;

public class InputTest {
    public static void main(String[] args) {

        Input input = new Input();
        System.out.println("input.getInt(\"Give me a number\") = " + input.getInt("Give me a number"));

        System.out.println("Your input: " + input.getDouble("Give me a decimal"));

    }
}
