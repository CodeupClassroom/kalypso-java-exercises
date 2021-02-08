public class ExceptionsLec {
    public static void main(String[] args) {
        System.out.println("Do I run? A");
        int[] numbers = {1, 2, 3};

        try {
            System.out.println(numbers[999]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("The array is shorter than 999");
        }

        System.out.println("Do I run? B");
    }
}
