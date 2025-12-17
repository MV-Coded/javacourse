public class Main {
    public static void main(String[] args) {
        // Пример 1: byte + short -> int
        byte b = 10;
        short s = 20;
        int result1 = b + s; // byte и short автоматически расширяются до int; результат — int

        // Пример 2: int + long -> long
        int i = 100;
        long l = 200L;
        long result2 = i + l; // int расширяется до long; результат — long

        // Пример 3: float + long -> float
        float f = 15.5f;
        long x = 1000L;
        float result3 = f + x; // long расширяется до float (т.к. float шире long в контексте арифметики); результат — float

        // Вывод 
        System.out.println("result1 (int): " + result1);
        System.out.println("result2 (long): " + result2);
        System.out.println("result3 (float): " + result3);
    }
}
