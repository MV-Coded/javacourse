final class FinalClass {
    // Этот класс объявлен как final - от него нельзя наследовать
    public void showMessage() {
        System.out.println("This is a final class");
    }
}

// Попытка создать подкласс от final-класса вызовет ошибку компиляции
// class SubClass extends FinalClass {  // Ошибка: Cannot inherit from final 'FinalClass'
//     // ...
// }

public class Main {
    public static void main(String[] args) {
        // Мы можем создавать объекты final-класса
        FinalClass obj = new FinalClass();
        obj.showMessage(); // Выведет: This is a final class
        
        // Но мы НЕ можем создать подкласс от FinalClass.
        // Любая попытка наследования приведет к ошибке компиляции.
        // Это гарантирует, что структура и поведение FinalClass останутся неизменными.
    }
}
