public class Main {
    public static void main(String[] args) {
        // Исходная строка
        String original = "Java";

        // 1. String -> StringBuilder
        StringBuilder sbFromStr = new StringBuilder(original);
        System.out.println("String -> StringBuilder: " + sbFromStr);

        // 2. String -> StringBuffer
        StringBuffer sfFromStr = new StringBuffer(original);
        System.out.println("String -> StringBuffer: " + sfFromStr);

        // 3. StringBuilder -> String
        String strFromSb = sbFromStr.toString();
        System.out.println("StringBuilder -> String: " + strFromSb);

        // 4. StringBuffer -> String
        String strFromSf = sfFromStr.toString();
        System.out.println("StringBuffer -> String: " + strFromSf);

        // 5. StringBuilder -> StringBuffer
        StringBuffer sfFromSb = new StringBuffer(sbFromStr);
        System.out.println("StringBuilder -> StringBuffer: " + sfFromSb);

        // 6. StringBuffer -> StringBuilder
        StringBuilder sbFromSf = new StringBuilder(sfFromSf);
        System.out.println("StringBuffer -> StringBuilder: " + sbFromSf);

        // 7. Прямое присваивание (неявное преобразование в String через toString())
        String directSb = sbFromSb; // Неявно вызывается toString()
        String directSf = sfFromSf; // Неявно вызывается toString()
        System.out.println("Direct assign (via toString): " + directSb + ", " + directSf);
    }
}
