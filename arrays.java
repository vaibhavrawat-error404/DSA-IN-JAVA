import java.util.Scanner;

public class arrays {
    static Scanner sc=new Scanner(System.in);

    //Basic Input output in array
    public static void basic() {

        int n;
        System.out.print("Enter the number of elements in the array :");
        n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements in the array :");
        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Enter the element at " + i+" = ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements of the array");
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {
        basic();
    }
}