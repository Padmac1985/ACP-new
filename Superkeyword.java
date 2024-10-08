class parent1 {
    void printMessage() {
        System.out.println(" I am in parent class ");
    }
}
class child1 extends parent1 {
    @Override
    void printMessage() {
        super.printMessage();
        System.out.println(" I am in child class ");
    }
}
public class Superkeyword {
    public static void main(String[] args) {
    child1 c = new child1();
    c.printMessage();
    }
}
