public class C {
    private String name;
    private int count;

    public C() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public void sayName() {
        System.out.println("CCCCCC");
    }

    @Override
    public String toString() {
        return this.name+"  "+this.count;
    }
}
