
import java.util.Scanner;

public class arrays {

    static Scanner sc = new Scanner(System.in);

    //first input output program
    public static void basic() {
        int n;

        System.out.print("Enter the size of the array: ");
        n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print array elements
        System.out.println("Array elements are:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    //find the max and sum of element
    public static void traverse() {
        int n;
        System.out.print("Enter the size of the array: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        int sum=0;

        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        int max=arr[0];

        System.out.println("Array elements are: ");
        for (int val:arr) {
            System.out.print(val + " ");
            if (val>max) {
                max=val;
            }
        }
        System.out.println();
        System.out.println("The sum of all elements in array is = "+sum);
        System.out.println("The maximum element in array is = "+max);

    }

    public static void main(String[] args) {
        //basic();
        traverse();

    }
}
