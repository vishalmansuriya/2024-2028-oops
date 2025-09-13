public class Geeks {
    String name;
    int id;

    Geeks(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {
        Geeks geek1 = new Geeks("vishal", 20);

        System.out.println("Geek name: " + geek1.name + " and GeekId: " + geek1.id);
    }
}
