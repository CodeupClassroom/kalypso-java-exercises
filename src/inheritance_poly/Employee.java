package inheritance_poly;

class Employee extends Person {

    private double salary;

    public Employee(String employeeName){
        super(employeeName);
    }

    public void doWork() {
        System.out.println("Work, work...");
    }

    // method overriding
    @Override
    public void sayHello() {
        System.out.println("How can I help you?");
    }

}