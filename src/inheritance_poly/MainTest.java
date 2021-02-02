package inheritance_poly;

public class MainTest {
    public static void main(String[] args) {

        Person fer = new Person("Fer");
        fer.sayHello();

        Employee sophie = new Employee("Sophie");
        sophie.sayHello();

        SuperHero theManOfSteel = new SuperHero("Clark Kent", "Superman");

        System.out.println(theManOfSteel.getName()); // "Superman"
        System.out.println(theManOfSteel.getSecretIdentity()); // "Clark Kent"

    }
}
