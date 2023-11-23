import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;

        do{
            System.out.println("Введите пароль: ");
            value = scanner.nextInt();

            if (value == 993513){
                System.out.println("ОК");
            } else{
                System.out.println("Неверный пароль.");
            }

        } while(value != 993513); // Отличие цикла: while, от do while. While-сначала выполняет условие, а затем проверяет инструкции.
        // do while-сначала выполняет инструкции, а потом проверяет условие.
    }
}
