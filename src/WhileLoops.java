public class WhileLoops {
    public static void main(String[] args) {
        int value = 0;
        while(value < 5){
            System.out.println("Hello " + value);
            value = value++; //Цикл выполняется до тех пор, пока выдаётся значение: true
        }
    }
}
