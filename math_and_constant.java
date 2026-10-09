import java.util.Scanner;
import java.lang.Math;

public class math_and_constant {
    public static void main(String[] args) {
        //final float PI = 3.14F;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the radius of circle:\n");

        double radius = sc.nextDouble();

        System.out.println("The circumference of the circle is :    "+ (Math.PI * 2 * radius) + "\n");
        System.out.println("The area of the circle is :     "+ (Math.PI * radius *radius)+"\n");

        sc.close();
    }
}
