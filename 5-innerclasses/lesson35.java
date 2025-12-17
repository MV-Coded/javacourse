public interface MyInterface {
    static class NestedClass {
        public void func() {
            System.out.println("Метод вложенного класса вызван");
        }
    }
}

// Вызов метода:
MyInterface.NestedClass nested = new MyInterface.NestedClass();
nested.func();
