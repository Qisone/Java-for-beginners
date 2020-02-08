import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите текст");
        String string = s.nextLine();           // Для чисел строка "int x = s.nextInt()"
        System.out.println("Введено "+string);
    }
}
