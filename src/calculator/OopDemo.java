package calculator;

public class OopDemo {
    public static void main(String[] args) {
        Person denis = new Person("Denis", 23);
        System.out.println("denis = " + denis.getName());

        Person artem = new Person("Artem", 24);
        System.out.println("artem = " + artem.getName());


        String result = Person.staticMethod();
        System.out.println("result = " + result);

    }
}
