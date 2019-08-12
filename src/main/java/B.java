public class B {

    private A a;
    public B(A a) {
        System.out.println("constructor of class B");

        this.a = a;
    }
    public void sayB() {
        System.out.println("BBBBB");
    }
    public void sayA() {
        a.sayA();
    }
}
