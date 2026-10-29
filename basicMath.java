import java.util.Scanner;

public class basicMath {
    static Scanner sc = new Scanner(System.in);

    //1.print num of digits
    public static void digitsOfNum(int num){
        while(num>0){
            int digit = num%10;//get the last digit
            System.out.println(num);
            num = num/10;
        }
    }

    //2.Sum of digits
    public static void countOFDigits(int num){
        int count=0;
        while(num>0){
            int digit = num%10;//get the last digit
            count++;
            num /=10;
        }
        System.out.println(count);
    }

    //3.Count of digits
    public static void sumOFDigits(int num){
        int sum=0;
        while(num!=0){
            int digit = num%10;
            sum+=digit;
            num /=10;
        }
        System.out.println("Sum Of all digit in Number: "+sum);
    }

    //4.Reverse the number
    public static void numReverse(int num){
        int rev=0;
        while(num!=0){
            int digit = num%10;
            rev=rev*10+digit;
            num /=10;
        }
        System.out.println("Reversed Number: "+rev);
    }

    //

    public static void  main(String[] args){
        System.out.print("Enter a number(Any natural number): ");
        int num = sc.nextInt();
        //digitsOfNum(num);
        //countOFDigits(num);
        //sumOFDigits(num);
        //numReverse(num);
        sc.close();
    }
}