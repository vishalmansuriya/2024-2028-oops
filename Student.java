class Student {
    String name;
    int age;

    Student() {
        this("Unknown", 0); 
        System.out.println("Default constructor called");
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor called");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();

        Student s2 = new Student("Surabhi", 22);
        s2.display();
    }
}