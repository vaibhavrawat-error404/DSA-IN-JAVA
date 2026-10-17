
import java.util.Scanner;

public class temConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice: 1 for C to F, any num for F to C:");
        int choice = sc.nextInt();

        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();

        double result = (choice == 1)
                ? (temp * (9.0 / 5.0)) + 32
                : (temp - 32) * (5.0 / 9.0);

        if(choice==1){
            System.out.println("Converted temperature: " + result+"F");
        }
        else{
            System.out.println("Converted temperature: " + result+"C");
        }

        sc.close();
    }
}
