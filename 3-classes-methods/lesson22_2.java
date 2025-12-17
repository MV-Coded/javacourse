import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Конструкция <? extends T> (wildcard с верхней границей)
        // Используется, когда нужно читать данные из коллекции, но не писать в нее.
        // Например, метод, который должен работать с любым списком, содержащим элементы типа Number или его подклассов (Integer, Double и т.д.)
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.1);
        doubleList.add(2.2);

        // Метод printNumbers может принимать List<Integer>, List<Double>, List<Number> и т.д.
        // Но нельзя добавить в такой список элементы, потому что компилятор не знает точного типа.
        printNumbers(intList);   // OK
        printNumbers(doubleList); // OK

        // Конструкция <? super T> (wildcard с нижней границей)
        // Используется, когда нужно писать данные в коллекцию, но не читать из нее (или читать как Object).
        // Например, метод, который должен добавлять элементы типа Number в любую коллекцию, которая может хранить Number или его суперклассы (Object).
        List<Number> numberList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();

        // Метод addNumbers может принимать List<Number>, List<Object> и т.д.
        // Можно безопасно добавлять элементы типа Number или его подклассов.
        addNumbers(numberList);   // OK
        addNumbers(objectList);   // OK
    }

    // Метод, который работает с любым списком, содержащим элементы типа Number или его подклассов
    public static void printNumbers(List<? extends Number> list) {
        for (Number n : list) {
            System.out.println(n);
        }
        // list.add(new Integer(5)); // ОШИБКА: Нельзя добавить элемент в список с extends
    }

    // Метод, который добавляет элементы типа Number в любой список, который может их содержать
    public static void addNumbers(List<? super Number> list) {
        list.add(10);           // OK: Integer - это подкласс Number
        list.add(10.5);         // OK: Double - это подкласс Number
        list.add(new Number() { // OK: Можно добавить анонимный подкласс
            @Override
            public int intValue() { return 0; }
            @Override
            public long longValue() { return 0L; }
            @Override
            public float floatValue() { return 0f; }
            @Override
            public double doubleValue() { return 0d; }
        });
        // Number n = list.get(0); // ОШИБКА: При чтении возвращается Object, нужно приведение типов
    }
}
