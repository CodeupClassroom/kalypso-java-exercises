class Person {                  // this is a blueprint for a type of object
    public String firstName;    // this is a property
    public String lastName;     // another property
    static long WORLD_POPULATION = 8000000000L; // static means it belongs to the class, not owned by an instance of the class

    public String sayHello() {  // this is a method
        return String.format("Hello from %s %s!", firstName, lastName);
    }

    Person(){
        WORLD_POPULATION++;
    }

    Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        WORLD_POPULATION++;
    }

    public static void main(String[] args) {
        System.out.println(Person.WORLD_POPULATION);
        Person fer = new Person();  // fer is an instance of Person
        fer.firstName = "Fernando";
        fer.lastName = "Mendoza";
        System.out.println(fer.sayHello());
        // prints "Hello from Fernando Mendoza!"

        Person chris = new Person();
        chris.firstName = "Chris";
        chris.lastName = "Cyr";
        System.out.println(chris.sayHello());

        Person daniel = new Person("Daniel", "Fryar");
        System.out.println(daniel.sayHello());
        Person casey = new Person("Casey", "Friday");
        System.out.println(Person.WORLD_POPULATION);

    }
}