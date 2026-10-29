import java.util.Scanner;
import java.lang.Math;

import static java.lang.Math.sqrt;


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

        //2.count of digits
        public static int countOFDigits(int num){
            int count=0;
            while(num>0){
                int digit = num%10;//get the last digit
                count++;
                num /=10;
            }
//            System.out.println(count);
            return count;
        }

        //3.sum of digits
        public static int sumOFDigits(int num){
            int sum=0;
            while(num!=0){
                int digit = num%10;
                sum+=digit;
                num /=10;
            }
//            System.out.println("Sum Of all digit in Number: "+sum);
            return sum;
        }

        //4.Reverse the number
        public static int numReverse(int num){
            int rev=0;
            while(num!=0){
                int digit = num%10;
                rev=rev*10+digit;
                num /=10;
            }
            System.out.println("Reversed Number: "+rev);
            return rev;
        }

        //5.Check if the number is a Palindrome
        public static void checkPalindrome(int num){
            int rev=numReverse(num);
            if (num==rev){
                System.out.println("Number is a Palindrome");
            }
            else{
                System.out.println("Number is not a Palindrome");
            }
            }

        //6.Check if a number is prime or not
        public static boolean checkPrime(int num) {
            boolean check = true;
            if (num <= 1) {
                return false;
            } else {
                for (int i = 2; i*i <= num; i++) {
                    if (num % i == 0) {
                        return false;
                    }
                }
            }
            return true;
        }


        //7.find GCD
        public static int getGCD(int a, int b){
                int num1=a;
                int num2=b;
                while(b!=0){
                    int oldValue=b;
                    b=a%b;
                    a=oldValue;
                }
                //System.out.printf("The GCD of %d and %d is %d ",num1,num2,a);
            return a;
        }

        //8.LCM
        public static int getLCM(int a,int b){
            int GCD=getGCD(a,b);

            int LCM=(a*b)/GCD;;
            return LCM;
        }

        //9.Armstrong Number
        public static void isArmstrong(int num){
            int sum=0;
            int temp=num;
            int count=countOFDigits(temp);
            while(num!=0){
                int digit=num%10;
                sum+= (int) Math.pow(digit,count);
                num/=10;
            }

            System.out.println("Sum of digits: "+sum);
            System.out.println("The Number: "+temp);

            if(sum!=temp){
                System.out.println("Number is not equal Sum,");
                System.out.println("Number is not a Armstrong");
            }
            else{
                System.out.println("Number is a Armstrong");
            }
        }

        //10.Perfect number less Efficient version
        public static void isPerfectNumber1(int num){
            int sum=0;
            for(int i=1;i<=num/2;i++){
                if(num%i==0){
                    sum+=i;
                }
            }
            if(sum==num){
                System.out.println("Number is a Perfect Number");
            }
            else{
                System.out.println("Number is not a Perfect Number");
            }
        }
        //10.Perfect number less Efficient version
        public static boolean isPerfectNumber2(int num){
            int sum=1;
            for(int i=2;i*i<=num;i++){
                if(num%i==0){
                    int firstFactor=i;
                    int secondFactor=num/i;
                    sum+=firstFactor+secondFactor;
                }
            }
            if(sum==num){
                return true;
            }
            else{
                return false;
            }
        }

        //11.All prime number 1 to n
        public static void allPrimeNUm(int num){
            for(int i=1;i<=num;i++) {
                if (checkPrime(i)) {
                    System.out.println(i);
                }
            }
                System.out.println();
        }


    public static void  main(String[] args){

        System.out.print("Enter a number(Any natural number): ");
        int num = sc.nextInt();
//        digitsOfNum(num);
//        countOFDigits(num);
//        sumOFDigits(num);
//        numReverse(num);
//        checkPalindrome(num);
//        checkPrime(num);
//        /*
//        System.out.println("Enter the two number to find there GCD(a>b): ");
//        System.out.print("Enter the first number: ");
//        int a = sc.nextInt();
//        System.out.print("Enter the second number: ");
//        int b = sc.nextInt();
//        int GCD=getGCD(a,b);
//        System.out.println("GCD: "+GCD);
//        int LCM=getLCM(a,b);
//        System.out.println("The LCM of the given number is: "+LCM);
//        */

//        isArmstrong(num);
//        isPerfectNumber1(num);
//        System.out.print(isPerfectNumber2(num));

        allPrimeNUm(num);

        sc.close();


    }
}