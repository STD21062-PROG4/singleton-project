
public class ClassUniqueInstanceTest {
    public static void main(String[] args) {
        ClassUniqueInstance instance1 = ClassUniqueInstance.INSTANCE;
        instance1.setClick(5);

        ClassUniqueInstance instance2 = ClassUniqueInstance.INSTANCE;
        System.out.println("Nombre de clics de la première instance : " + instance2.getClick());

        instance2.setClick(10);
        System.out.println("Nombre de clics de la deuxième instance : " + instance1.getClick());
    }
}
