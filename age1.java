import java.util.Scanner;

public class Age1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("My age is " + age);

        sc.close();
    }
}
