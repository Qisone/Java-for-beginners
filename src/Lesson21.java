public class Lesson21 {
    public static void main(String[] args) {
        Human21 h1 = new Human21("Bob",30);
        Human21 h2 = new Human21("Tom", 20);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
    }
}

class Human21 {

    private String name;
    private int age;
    private static int countPeople = 0;

    public Human21(String name, int age){
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name) {
        this.name = name;
        countPeople++;
    }

    public void setAge(int age) {
        this.age = age;
        countPeople++;
    }

    public void printNumberOfPeople(){
        System.out.println("Number of People is "+countPeople);
    }
}
