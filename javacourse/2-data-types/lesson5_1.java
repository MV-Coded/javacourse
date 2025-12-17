public class Main {
    public static void main(String[] args) {
        // Примеры значений базовых типов
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4L;
        float f = 5.0f;
        double d = 6.0;
        char c = 'A';
        boolean bool = true;

        // Нулевые значения (значения по умолчанию)
        byte b0 = 0;
        short s0 = 0;
        int i0 = 0;
        long l0 = 0L;
        float f0 = 0.0f;
        double d0 = 0.0;
        char c0 = '\u0000';
        boolean bool0 = false;

        // Вывод значений
        System.out.println("Примеры значений базовых типов:");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);

        System.out.println("\nНулевые значения (по умолчанию):");
        System.out.println("byte: " + b0);
        System.out.println("short: " + s0);
        System.out.println("int: " + i0);
        System.out.println("long: " + l0);
        System.out.println("float: " + f0);
        System.out.println("double: " + d0);
        System.out.println("char: " + (c0 == '\u0000' ? "'\\u0000'" : c0));
        System.out.println("boolean: " + bool0);
    }
}
