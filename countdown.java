import java.util.Scanner;

public class countdown {
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to start a countdown with :");
        int n = sc.nextInt();
        for (int i = n; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000); // Pause for 1 second
        }

        System.out.println("HAPPY NEW YEAR!");
    }
}
