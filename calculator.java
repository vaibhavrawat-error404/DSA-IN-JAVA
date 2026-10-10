import java.util.Scanner;
import java.lang .Math;

public class calculator {

    public static void calc(double num1,char operator,double num2,double result,boolean validOperation){
        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if(num2==0){
                    System.out.println("Cannot divide by zero");
                }
                else{
                    result = num1 / num2;
                }
            }
        case '^' -> result = Math.pow(num1, num2);
        default ->{
            System.out.println("Invalid input");
            validOperation = false;
        }
        }
        if(validOperation){
            System.out.println("The result is: " + result);
        }

    }


    public static void main(String[] args){
        double num1;
        double num2;
        char operator;
        double result=0;
        boolean validOperation=true;

        Scanner sc =new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        num1=sc.nextDouble();
        System.out.print("Enter the Operator(+,-,/,^,*): ");
        operator=sc.next().charAt(0);
        System.out.print("Enter 2nd number: ");
        num2=sc.nextDouble();

        calc(num1,operator,num2,result,validOperation);

        sc.close();
    }
}
