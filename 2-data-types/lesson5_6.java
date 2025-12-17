public class Main {
    public static void main(String[] args) {
        // Сужение из int в short
        int i1 = 30000;
        short s = (short) i1;

        // Сужение из long в int
        long l = 1_000_000_000L;
        int i2 = (int) l;

        // Сужение из double в float
        double d = 123.456789;
        float f = (float) d;

        // Вывод
        System.out.println("short: " + s);
        System.out.println("int from long: " + i2);
        System.out.println("float: " + f);
    }
}
