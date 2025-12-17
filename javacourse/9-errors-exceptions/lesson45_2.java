public class Main {
    public static void main(String[] args) {
        // ArithmeticException
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }

        // ArrayIndexOutOfBoundsException
        try {
            int[] arr = {1, 2, 3};
            int value = arr[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // IllegalArgumentException
        try {
            if (args.length == 0) throw new IllegalArgumentException("No arguments provided");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }

        // ClassCastException
        try {
            Object obj = "string";
            Integer num = (Integer) obj; // Ошибка приведения типа
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: " + e.getMessage());
        }

        // NullPointerException
        try {
            String str = null;
            int len = str.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
    }
}
