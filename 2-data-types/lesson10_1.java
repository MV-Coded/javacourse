public class Main {
    public static void main(String[] args) {

        // 1. byte
        byte b = 2;
        switch (b) {
            case 1: System.out.println("byte: 1"); break;
            case 2: System.out.println("byte: 2"); break;
        }

        // 2. short
        short s = 3;
        switch (s) {
            case 3: System.out.println("short: 3"); break;
        }

        // 3. int
        int i = 4;
        switch (i) {
            case 4: System.out.println("int: 4"); break;
        }

        // 4. char
        char c = 'A';
        switch (c) {
            case 'A': System.out.println("char: A"); break;
        }

        // 5. Character (обёртка)
        Character ch = 'B';
        switch (ch) {
            case 'B': System.out.println("Character: B"); break;
        }

        // 6. Byte, Short, Integer (обёртки)
        Integer num = 5;
        switch (num) {
            case 5: System.out.println("Integer: 5"); break;
        }

        // 7. String (начиная с Java 7)
        String str = "hello";
        switch (str) {
            case "hello": System.out.println("String: hello"); break;
        }

        // 8. enum
        Day day = Day.MONDAY;
        switch (day) {
            case MONDAY: System.out.println("enum: MONDAY"); break;
        }
    }

    // Вспомогательный enum для примера
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY
    }
}
