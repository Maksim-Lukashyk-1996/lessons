import java.net.SocketOption;

public class Variables {
    public static void main(String[] args){
        int myInt = 557; // Целые числа.
            short myShort = 3266; // Вмещает в себя только 16-ти битные числа. -32000, 32000
            long myLong = 26246246; // Вмещает в себя 64 бита иформации, позволяет хранить большие числа.

            double myDouble = 235.35; // Хранит 64 бита информации
            float  myFloat = 2362.4f; // 32 бита. Буква f в конце обязательно.

            char c = 'a'; //Представляет из себя символ
            boolean b = true; // Логический тип данных, принимает значение true/false

            byte myByte = 100; //-128, 128


        System.out.println(myInt);
        System.out.println(myFloat);
    }
}