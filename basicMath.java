import java.util.Scanner;

public class basicMath {
    static Scanner sc = new Scanner(System.in);

    //1.print num of digits
    public static void digitsOfNum(int digit){
        while(digit>0){
            int num = digit%10;//get the last digit
            System.out.println(num);
            digit = digit/10;
        }
    }

    //2.Sum of digits

    //3.Count of digits

    public static void  main(String[] args){
        System.out.print("Enter a number(Any natural number): ");
        int digit = sc.nextInt();
        //digitsOfNum(digit);
        sc.close();
    }
}