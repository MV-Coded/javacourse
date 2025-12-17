import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner fileScanner = new Scanner(new File("input.txt"));
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        }
    }
}
