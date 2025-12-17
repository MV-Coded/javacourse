public class OuterClassToInner {
    public static void main(String[] args) {
        OuterClassToInner outer = new OuterClassToInner();

        // Создаем экземпляр внутреннего класса
        InnerClass inner = outer.new InnerClass();

        // Внешний класс может обращаться только к тем членам внутреннего класса,
        // которые имеют соответствующий спецификатор доступа

        // Доступ к public членам внутреннего класса - всегда возможен
        System.out.println(inner.publicField);
        inner.publicMethod();

        // Доступ к private членам внутреннего класса - НЕВОЗМОЖЕН извне
        // System.out.println(inner.privateField); // Ошибка компиляции
        // inner.privateMethod(); // Ошибка компиляции

        // Доступ к protected и package-private членам зависит от контекста
        // (пакет, наследование), но в этом примере мы просто покажем public доступ
    }

    public class InnerClass {
        public String publicField = "Публичное поле внутреннего класса";
        private String privateField = "Приватное поле внутреннего класса";

        public void publicMethod() {
            System.out.println("Публичный метод внутреннего класса");
        }

        private void privateMethod() {
            System.out.println("Приватный метод внутреннего класса");
        }
    }
}
