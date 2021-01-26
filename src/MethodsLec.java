public class MethodsLec {
    // Method Structure
    public static int addNumbers(int num1, int num2) {
        return num1 + num2; // because the type is "int" - this method must return an "int"
    }

    public int subtractNumbers(int num1, int num2) {
        return num1 - num2;
    }

    public void greetings() {
        // void methods can be static or non-static - main point is that they will NOT have to return anything
        System.out.println("Hello, to you!");
        // this is not returning anything
    }

    public static void main(String[] args) {
        // This main method can be seen as separate from the MethodsLec class, so we need to instantiate all variables
        //   again, that we want to use in logical calculations here

        // Let's add 2 numbers.

        // Static
        int sum = MethodsLec.addNumbers(2, 2);
        System.out.println("Using our static method: ");
        System.out.println(sum);

        double squaredNumber = Math.pow(3, 2);

        // Math caseyMathMagic = new Math();

        // Non-static
        MethodsLec mathWiz = new MethodsLec();
        mathWiz.greetings();
        int difference = mathWiz.subtractNumbers(10, 6); // num1 - num2
        System.out.println("Using a non-static method: ");
        System.out.println(difference);

        System.out.println(MethodsLec.tenureMessage("Casey", "PHP", 11));
        System.out.println(MethodsLec.tenureMessage("Daniel", "Java", 15));
        System.out.println(MethodsLec.tenureMessage("Fernando", "PHP", 30));

        System.out.println(MethodsLec.tenureMessage("Casey", "Java"));
        System.out.println(MethodsLec.tenureMessage("Go"));

        MethodsLec.sayHello("Bonjour", "Jean Luc");

        // String thisMessage = MethodsLec.tenureMessage("Java", 20);
    } // END: psvm

    // start of tenureMessage
    public static String tenureMessage(String name, String progLang, int numYears) {
        // String thePersonName = name;
        // String codingLanguage = progLang;
        // int totalTime = numYears;

        return name + " has been coding " + progLang + " for " + numYears + " years.";
        // return "X has done Y for Z years";
    }

    // ****************** METHOD OVERLOADING ****************** //
    public static String tenureMessage(String name, String progLang) {
        return name + " is super good at " + progLang;
    }

    public static String tenureMessage(String progLang) {
        return "Somebody is sure to be good at " + progLang;
    }

    // version 1
    public static void sayHello(int times) {
        for (int i = 0; i < times; i += 1) {
            sayHello(); // calling sayHello()
        }
    }
    // clever version1
    // public static void sayHello(int rotations) {
    //     // this will not work, because we already have a version that takes in 1 integer
    // }
    // version 2
    public static void sayHello() {
        sayHello("Hello", "World"); // calling sayHello(String1, String2)
    }
    // version 3
    public static void sayHello(String name) {
        sayHello("Hello", name);
    }
    // version 4
    public static void sayHello(String greeting, String name) {
        System.out.println(greeting + ", " + name + "!");
    }

}
