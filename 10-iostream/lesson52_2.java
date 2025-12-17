import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            String text = "Hello, World!";
            for (char c : text.toCharArray()) {
                fos.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
