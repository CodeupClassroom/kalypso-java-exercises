import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        // 3-person Array
        // Person[] people = new Person[3];
        Person casey = new Person("Casey");
        Person fernando = new Person("Fernando");
        Person daniel = new Person("Daniel");

        Person[] people = {casey, fernando, daniel};
        System.out.println(people);

        Person wonderWoman = new Person("Diana");
        System.out.println(Arrays.toString(addPerson(people, wonderWoman)));

    }

    public static Person[] addPerson(Person[] people, Person newPerson) {
        Person[] morePeople = Arrays.copyOf(people, people.length+1);
        morePeople[morePeople.length-1] = newPerson;
        return morePeople;
    }
}
