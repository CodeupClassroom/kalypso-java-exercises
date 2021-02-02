package inheritance_poly;

class Person {
    public String name;

    public Person(String name) {
        this.name = name.trim();
    }

    public void sayHello() {
        System.out.println("Hello from " + name + "!");
    }
}