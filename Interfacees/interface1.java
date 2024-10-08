interface myinterface {
    public void method1 ();
    public void method2();

}
public class interface1 implements myinterface {
    public void method1() {
        System.out.println(" Method 1 ");
    
    }
    public void method2() {
        System.out.println(" Method 2 ");
    }


    public static void main (String [] args) {
        myinterface obj = new interface1();
        obj.method1();
        obj.method2();

    }
}