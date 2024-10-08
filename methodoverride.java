class parent {
    void printMessage() {
        System.out.println(" I am in parent class ");
    }
}
class child extends parent {
    @Override
    void printMessage() {
        System.out.println(" I am in child class ");
    }
}
public class methodoverride {
    public static void main(String[] args) {
    child c = new child();
    c.printMessage();
    }
}
