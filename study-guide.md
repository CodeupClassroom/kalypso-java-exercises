# Java Fundamentals

## Main Concepts to be Assessed

- Object Oriented Programming
- Method Overriding and Method Overloading
- Arrays
- Inheritance and Polymorphism
- Interfaces
- Collections
- Exceptions and Error Handling

## Currently not being assessed:

- Annotations like @SuppressWarnings or @Deprecated
- Files I/O
- Abstract Classes
- Deployment and Dependencies
- Testing Code with JUnit

## Java Fundamentals Checklist

The following are several points of competency and skill that are intended to help identify areas of additional practice and study. Not all answers are found in the Codeup curriculum.

## Knowledge

### Java I

- [ ] I can explain how Java code runs: from being written to executing on an operation system.
- [ ] I can explain the difference between a primitive type and a reference type in Java.
- [ ] I can name several primitive types in Java.
- [ ] I can explain why multiple number primitive types are used.
- [ ] I can give an example of implicit and explicit casting.
- [ ] I can explain the difference between a runtime and compile-time error.
- [ ] I can identify the major editions of Java.
- [ ] I can define what a Java wrapper class is.

### Java II

- [ ] I can articulate what OOP is.
- [ ] I can identify the four levels of visibility for a class/field/method and the identifiers used.
- [ ] I know what class of static methods is often used when working with arrays.
- [ ] I can explain the difference between static (class) fields/methods and instance fields/methods.
- [ ] I can explain the difference between method overloading and method overriding.
- [ ] I can identify the four pillars of object-oriented programming and give examples of each one.
- [ ] I can describe the differences between interfaces and abstract classes and their use cases.
- [ ] I can generally describe what the Java Collections Framework is and specifically talk about the differences between a list, set, and map.
- [ ] I can explain the difference between a checked and unchecked exception.
- [ ] I can explain what a Java annotation is, why they are used, and give examples.
- [ ] I can explain the difference between the throws and throw keywords with regard to exceptions.

## Skills

### Java I

- [ ] I can write a hello world Java program from scratch.
- [ ] I can write Java control statements (if, if/else, switch, ternary) and loops (while, do-while, for, for-each) from memory.
- [ ] I can write examples of the 8 Java primitive types.
- [ ] I can write examples of explicit casting and implicit casting.
- [ ] I can convert a numeric string to a number and a number to a numeric string.
- [ ] I can define a constant.
- [ ] I can write a program that takes in user input and returns an output to the user.
- [ ] I can compare two string values.
- [ ] I can write out a program comprised of multiple methods.
- [ ] I can get the length of string, trim it, get a portion of the string, create a new string replacing some portion of it.

### Java II

- [ ] I can write a class that contains both static and instance fields and methods, constructors, setters and getters.
- [ ] I can write a program composed of multiple classes requiring instantiation (not just using classes as groups of static methods).
- [ ] I can write my own reference type and fill instances of it in an ArrayList and HashMap and use it as a return and input type of a method.
- [ ] I can write an abstract class and a subclass that extends from the abstract class.
- [ ] I can write multiple interfaces and implement their methods in another class.
- [ ] I can create arrays of various data types and sizes with and without using an array initializer.
- [ ] I can get the length of an array, get a specific element or range of elements, create a new array replacing some portion of it, and iterate over an array of elements.
- [ ] I can do the above with an ArrayList.
- [ ] I can comfortably use the helper methods of both Arrays and Collections classes.
- [ ] I can write a program that throws a runtime exception.
- [ ] I can write an example of method overloading and method overriding.
- [ ] I can write a program that reads and writes to a file.
- [ ] I can write methods and collections that work with a parent class or interface type but use instances of objects that extend from these parent classes or implement these interfaces (Polymorphism).

## Example Problems

Below are examples of the type of problem you will encounter on the assessment. These problems are not an exhaustive example of all the topics that will be covered on the assessment, rather, are meant to familiarize you with the kind of problem and format to expect.

1. Create an `Assessment` class with a public static method named `half`. It should accept a number and return the number divided by two.
1. Within your `Assessment` class create a public static method named `shout`. It should accept a string and return the same string in all upper case with 3 exclamation marks added to the end of it.
1. Create an `Animal` class. It should have private instance properties for a `name` and ``, and public getters and setters for both.
1. Within your `Animal` class, define an instance method named `roar`. It should accept no arguments and return a string like "I am $NAME, hear me roar!" where `$NAME` is replaced with the value of the name property for that object.
1. Within your `Assessment` class create a public static method named `removeCats`. It should accept a list of animal objects and return a list of animal objects where any animal object with a species of "Felis catus" is removed.

Note that the assessment spec only requires you to have methods and classes defined, there is not any requirement for a `main` method. However, creating additional methods will **not** be counted against you, so you are **_highly encouraged_** to create a `main` method and write some code that tests out the code you are writing for the assessment specification. For example, if you were working on the `half` function, you should call that function within the main method and make sure that it returns the correct values for several test cases.

