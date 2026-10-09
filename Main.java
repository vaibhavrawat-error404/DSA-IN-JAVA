import java.util.Scanner;
import java.lang.Math;

public class Main {
public static double pythagoras(int a, int b) {
    return Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
}

public static double circumference(int r){
    return Math.PI*2*r;
}

public static double area(double r){
    return r*r;
}

public static double volume(double radius){
    return (4*Math.PI*Math.pow(radius,3))/3;
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the Perpendicular length:");
        int a=sc.nextInt();

        System.out.print("Enter the Base length:");
        int b=sc.nextInt();

        System.out.println("Hypotenuse of Triangle is "+pythagoras(a,b)+"cm");

        System.out.print("Enter the Radius of Circle:");
        int r=sc.nextInt();

        System.out.print("Circumference Of Circle is "+circumference(r)+"cm");
        System.out.println("\nArea Of Circle is "+area(r)+"cm2");

        System.out.print("Enter the Radius of Sphere:");
        double radius=sc.nextInt();
        System.out.println("Volume Of Sphere is "+volume(radius)+"cm");

        sc.close();
    }
}

