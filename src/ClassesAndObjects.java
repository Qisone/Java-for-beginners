public class ClassesAndObjects {
    public static void main(String[] args) {
        Person persone1 = new Person();
        persone1.setName("Владимир");
        persone1.setAge(12);
        System.out.println("Выводим значение в main методе" + persone1.getName());
        System.out.println("Выводим значение в main методе" + persone1.getName());
    }
}

class Person {                                                                   // Класс
    private String name;
    private int age;

    public void setName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("Заполните поле");
        } else {
            name = userName;
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int userAge) {
        if (userAge < 0) {
        } else {
            age = userAge;
        }
    }

    public int getAge() {
        return age;
    }

    void setNameAndAge(String username, int userage) {
        name = username;
        age = userage;
    }

    int calculeteYearsToRetiremente() {
        int years = 65 - age;
        return years;

    }

    void speak() {                                                              // Метод
        for (int i = 0; i < 3; i++) {
            System.out.println("Привет, меня зовут " + name + ", мне " + age + " лет");
        }
    }

    void sayHello() {
        System.out.println("Hello!");
    }
}
