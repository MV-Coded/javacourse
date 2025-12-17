public class CustomObject {
    private int id;
    private String name;

    public CustomObject(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        // 1. Сравнение с самим собой
        if (this == obj) return true;
        
        // 2. Проверка на null и тип
        if (obj == null || getClass() != obj.getClass()) return false;
        
        // 3. Приведение типа и сравнение полей
        CustomObject that = (CustomObject) obj;
        return id == that.id && 
               (name != null ? name.equals(that.name) : that.name == null);
    }
}
