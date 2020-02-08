import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);  // Способ вводить данные с клавиатуры
        System.out.println("Введи возраст");
        int age = scanner.nextInt();
        switch (age){
            case 0:
                System.out.println("Ты родился");
                break;
            case 7:
                System.out.println("Ты пошел в школу");
                break;
            case 18:
                System.out.println("Ты закончил школу");
                break;
            default:
                System.out.println("Не одно из значений не подошло");
        }
    }
}
