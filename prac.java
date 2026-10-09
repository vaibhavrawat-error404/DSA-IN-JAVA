import java.util.Scanner;
import java.lang.Math;

public class prac{
    public static int  sumNum(int a ,int b){
        int sum=(a+b);
        return sum;
    }

//    public static int sumOfArray(int []arr,int n){
//        int total=0;
//        for(int i=0;i<n;i++){
//            total+=arr[i];
//        };
//        return total;
//    }
    public static int sumOfArray(int[] arr) {
        int total = 0;
        for (int x : arr) {
            total += x;
        }
        return total;
    }
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter second number: ");
        int b=sc.nextInt();
        System.out.println(sumNum(a,b));

        System.out.print("Enter  the number of Elements in the array: ");
        int n=sc.nextInt();

        int []arr=new int[n];

        System.out.print("Enter the elements in the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(sumOfArray(arr));
    }
}