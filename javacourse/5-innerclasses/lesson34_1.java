public class OuterClass {
    private String outerField = "Внешнее поле";

    // Внутренний класс с модификатором public
    public class PublicInner {
        public void display() {
            System.out.println("PublicInner: " + outerField); // Доступ к private полю внешнего класса
        }
    }

    // Внутренний класс с модификатором private
    private class PrivateInner {
        public void display() {
            System.out.println("PrivateInner: " + outerField);
        }
    }

    // Внутренний класс с модификатором protected
    protected class ProtectedInner {
        public void display() {
            System.out.println("ProtectedInner: " + outerField);
        }
    }

    // Внутренний класс без модификатора (package-private)
    class PackageInner {
        public void display() {
            System.out.println("PackageInner: " + outerField);
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();

        // Создание экземпляров внутренних классов
        OuterClass.PublicInner pub = outer.new PublicInner();
        pub.display();

        // Для private/protected/package-inner нужно создавать внутри OuterClass или в том же пакете
        // Пример для package-private (если в одном пакете):
        OuterClass.PackageInner pkg = outer.new PackageInner();
        pkg.display();

        // Пример для protected (если в одном пакете или наследнике):
        OuterClass.ProtectedInner prot = outer.new ProtectedInner();
        prot.display();

        // Пример для private (только внутри OuterClass):
        // OuterClass.PrivateInner priv = outer.new PrivateInner(); // Ошибка, если не внутри OuterClass
        // Но можно вызвать через метод:
        outer.createAndUsePrivateInner();
    }

    // Метод для демонстрации использования private inner class
    private void createAndUsePrivateInner() {
        PrivateInner priv = new PrivateInner();
        priv.display();
    }
}
