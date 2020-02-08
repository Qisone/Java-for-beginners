public class Break_Continue {
    public static void main(String[] args) {
        for(int i = 0; i<=15; i++) {      // это счетчик
            if(i%2==0){                   // это условие
                continue;  // continue выдаст все не четные числа до 15
            }
            System.out.println("Это не четное число "+i);
        }
    }
}
