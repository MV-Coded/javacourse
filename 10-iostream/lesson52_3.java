import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class Main {
    public static void main(String[] args) {
        // InputStream/OutputStream работают с байтами (8-битными)
        // Reader/Writer работают с символами (16-битными Unicode)
        // Это позволяет корректно обрабатывать текст в разных кодировках.
        System.out.println("Reader и Writer нужны для удобной работы с текстом, а не с сырыми байтами.");
    }
}
