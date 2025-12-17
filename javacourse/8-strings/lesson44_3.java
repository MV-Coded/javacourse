public class Main {
    public static void main(String[] args) {
        java.util.Date now = new java.util.Date();

        System.out.printf("Час (00-23): %tH%n", now);
        System.out.printf("Минуты: %tM%n", now);
        System.out.printf("Секунды: %tS%n", now);
        System.out.printf("Год: %tY%n", now);
        System.out.printf("Полное название месяца: %tB%n", now);
    }
}
