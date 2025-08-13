import java.util.Scanner;

public class MeterToFeetConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length in meters (integer): ");
        int meters = sc.nextInt();

        double feet = meters * 3.28084;

        System.out.println(meters + " meters = " + feet + " feet");

        sc.close();
    }
}
