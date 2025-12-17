public class Main {
    public static void main(String[] args) {
        // В этом примере мы намеренно допускаем опечатку в имени метода,
        // чтобы показать, как @Override помогает обнаружить ошибку на этапе компиляции.
        
        // Скомпилируется без ошибок, но метод не будет переопределён!
        // Неверный метод (опечатка в имени):
        /*
        class WrongCat extends Animal {
            public void spek() { // Опечатка: должно быть speak()
                System.out.println("Meow!");
            }
        }
        */

        // С аннотацией @Override компилятор сразу покажет ошибку:
        try {
            class CorrectCat extends Animal {
                @Override
                public void spek() { // ОШИБКА КОМПИЛЯЦИИ: метод не переопределяет ничего
                    System.out.println("Meow!");
                }
            }
        } catch (Exception e) {
            System.out.println("Код с @Override не скомпилируется из-за опечатки в имени метода.");
        }

        // Правильный вариант с @Override:
        class Cat extends Animal {
            @Override
            public void speak() { // Теперь всё верно
                System.out.println("Meow!");
            }
        }

        Animal cat = new Cat();
        cat.speak(); // Выведет: Meow!
    }
}

class Animal {
    public void speak() {
        System.out.println("Animal speaks.");
    }
}
