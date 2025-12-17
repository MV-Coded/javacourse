public class OuterClassAccess {
    private String secret = "Секретное поле";
    public String publicField = "Публичное поле";

    private void privateMethod() {
        System.out.println("Вызван приватный метод внешнего класса");
    }

    public void publicMethod() {
        System.out.println("Вызван публичный метод внешнего класса");
    }

    public class InnerClass {
        public void accessOuterMembers() {
            // Внутренний класс имеет полный доступ ко всем членам внешнего класса,
            // независимо от их спецификаторов доступа
            System.out.println(secret); // Доступ к private полю
            System.out.println(publicField); // Доступ к public полю

            privateMethod(); // Вызов private метода
            publicMethod(); // Вызов public метода
        }
    }

    public static void main(String[] args) {
        OuterClassAccess outer = new OuterClassAccess();
        OuterClassAccess.InnerClass inner = outer.new InnerClass();
        inner.accessOuterMembers();
    }
}
