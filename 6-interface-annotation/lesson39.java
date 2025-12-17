public class Main {
    public static void main(String[] args) {
        // 1. @Override
        // Используется для указания, что метод переопределяет метод из суперкласса или интерфейса.
        // Помогает избежать ошибок при опечатках в имени метода или сигнатуре.
        // Пример:
        class Parent {
            void display() {
                System.out.println("Parent display");
            }
        }

        class Child extends Parent {
            @Override
            void display() { // Ошибка компиляции, если бы метод не существовал в родителе
                System.out.println("Child display");
            }
        }

        // 2. @Deprecated
        // Указывает, что элемент (метод, класс, поле) устарел и не рекомендуется к использованию.
        // Компилятор выдает предупреждение при использовании такого элемента.
        // Пример:
        class OldClass {
            @Deprecated
            void oldMethod() {
                System.out.println("Этот метод устарел!");
            }
        }

        OldClass obj = new OldClass();
        obj.oldMethod(); // Предупреждение от компилятора

        // 3. @SuppressWarnings
        // Подавляет конкретные предупреждения компилятора.
        // Часто используется для подавления предупреждений о небезопасных операциях (например, unchecked).
        // Пример:
        @SuppressWarnings("unchecked") // Подавляем предупреждение о небезопасном приведении типов
        void someMethod() {
            java.util.List list = new java.util.ArrayList();
            list.add("Hello");
            String str = (String) list.get(0); // Без аннотации было бы предупреждение
            System.out.println(str);
        }

        // Демонстрация работы всех трех аннотаций
        System.out.println("=== Примеры использования аннотаций ===");
        
        // Создаем объект дочернего класса и вызываем переопределенный метод
        Child child = new Child();
        child.display();

        // Вызываем устаревший метод (получим предупреждение)
        obj.oldMethod();

        // Вызываем метод с подавленными предупреждениями
        someMethod();

        System.out.println("\nАннотации — это метаданные, которые добавляются к коду и применяются к объявлениям пакетов, классов, конструкторов, методов, полей, параметров и локальных переменных.");
        System.out.println("Они могут быть обработаны компилятором, инструментами или во время выполнения программы.");
    }
}
