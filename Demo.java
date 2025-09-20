class SuperClass {
    int a, b;

    public void get(int x, int y) {
        a = x;
        b = y;
    }
}

class SubClass extends SuperClass {
    int a, b;

    public void set() {
        this.a = super.a;
        this.b = super.b;
    }

    public void put() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

public class Demo {
    public static void main(String[] args) {
        SubClass ob = new SubClass();
        ob.get(10, 20);
        ob.set();
        ob.put();
    }
}