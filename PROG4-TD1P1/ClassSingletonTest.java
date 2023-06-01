public class ClassSingletonTest {
    public static void main(String[] args) {
        ClassSingleton singleton1 = ClassSingleton.getInstance();
        singleton1.setDescription("Première instance");

        ClassSingleton singleton2 = ClassSingleton.getInstance();
        System.out.println("Description de la première instance : " + singleton2.getDescription());

        singleton2.setDescription("Nouvelle description");
        System.out.println("Description de la deuxième instance : " + singleton1.getDescription());
    }
}
