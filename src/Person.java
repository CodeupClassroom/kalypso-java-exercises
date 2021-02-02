class Person {
    private String name;

    Person(String name){
        this.name = name;
    }

    public String getName(){
//TODO: return the person's name
        return this.name;
    }
    public void setName(String name){
//TODO: change the name property to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello, my name is " + this.name);
    }

    public String toString() {
        return name;
    }

    public static void main(String[] args){
        Person bob = new Person("Bob");
        System.out.println(bob.getName());
        bob.setName("Bobby");
        bob.sayHello();

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }

}