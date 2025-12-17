public class Main {
    public static void main(String[] args) {
        // Создание объектов
        StringBuilder sb = new StringBuilder("Hello");
        StringBuffer sf = new StringBuffer("World");

        // 1. append() - добавление строк/символов
        sb.append(" Java"); // StringBuilder
        sf.append(" Programming"); // StringBuffer
        System.out.println("append(): " + sb + ", " + sf);

        // 2. insert() - вставка строки/символа по индексу
        sb.insert(5, " Beautiful"); // StringBuilder
        sf.insert(0, "Hello "); // StringBuffer
        System.out.println("insert(): " + sb + ", " + sf);

        // 3. reverse() - реверс строки
        sb.reverse(); // StringBuilder
        sf.reverse(); // StringBuffer
        System.out.println("reverse(): " + sb + ", " + sf);

        // 4. delete() - удаление символов по диапазону
        sb.delete(0, 6); // StringBuilder (удалить первые 6 символов)
        sf.delete(0, 5); // StringBuffer (удалить первые 5 символов)
        System.out.println("delete(): " + sb + ", " + sf);

        // 5. replace() - замена подстроки
        sb.replace(0, 5, "Hi"); // StringBuilder
        sf.replace(0, 5, "Bye"); // StringBuffer
        System.out.println("replace(): " + sb + ", " + sf);

        // 6. substring() - получение подстроки
        String subSb = sb.substring(0, 3); // StringBuilder
        String subSf = sf.substring(0, 3); // StringBuffer
        System.out.println("substring(): " + subSb + ", " + subSf);

        // 7. length() - длина строки
        int lenSb = sb.length(); // StringBuilder
        int lenSf = sf.length(); // StringBuffer
        System.out.println("length(): " + lenSb + ", " + lenSf);

        // 8. capacity() - текущая емкость буфера
        int capSb = sb.capacity(); // StringBuilder
        int capSf = sf.capacity(); // StringBuffer
        System.out.println("capacity(): " + capSb + ", " + capSf);

        // 9. setLength() - установка длины строки
        sb.setLength(3); // StringBuilder
        sf.setLength(3); // StringBuffer
        System.out.println("setLength(): " + sb + ", " + sf);

        // 10. toString() - преобразование в String
        String strSb = sb.toString(); // StringBuilder
        String strSf = sf.toString(); // StringBuffer
        System.out.println("toString(): " + strSb + ", " + strSf);
    }
}
