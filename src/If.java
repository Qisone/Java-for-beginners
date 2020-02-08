public class If {
    public static void main(String[] args) {
        int MyInt = 15;
        if(MyInt<10){                              // оператор if выполняет условие, если оно верно он выводит инф
            System.out.println("Да верно!");
        } else if(MyInt>20) {
            System.out.println("Не верно!");   // оператор else выполняет вывод инф. если условие if не верно
        } else {
            System.out.println("Не один не подошел");
        }
    }
}
