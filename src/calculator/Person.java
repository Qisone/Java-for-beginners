package calculator;

public class Person {

    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public static String staticMethod() {
        return "Hello world!";
    }

    @Override
    public String toString() {
        return "Person{name = " + name + ", age = " + age + "}";
    }
}
