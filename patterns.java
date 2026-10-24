import java.util.Scanner;

public class patterns {
    static Scanner sc = new Scanner(System.in);

    //1. and 2. basic loops
    public static void pattern1(){
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                System.out.println("i="+i+",j="+j);
            }
            System.out.println();
        }
    }
    public static void pattern2(){
        int i=1;
        while(i<=2){
            int j=1;
            System.out.print("When i ="+i+" j =");
            while(j<=3){
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
    //3.square and rectangle pattern
    public static void pattern3(){
        int row;
        int column;
        char ch;


        System.out.print("Enter the number of rows: ");
        row = sc.nextInt();
        System.out.print("Enter the number of column: ");
        column = sc.nextInt();
        System.out.print("Enter the character: ");
        ch = sc.next().charAt(0);


        for(int i=1;i<=row;i++){
            for(int j=1;j<=column;j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    //4.hollow square pattern
    public static void pattern4() {
        System.out.print("Enter the size of pattern (1-10): ");
        int n = sc.nextInt();
        int row = n;
        int column = n;
        char ch;

        System.out.print("Enter the character: ");
        ch = sc.next().charAt(0);
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                if (i == 1 || i == row || j == 1 || j == column) {
                    System.out.print(ch);
                }

                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    //5.Solid-right angled triangle
    public static void pattern5(){

        int row;
        int column;
        char ch;
        System.out.print("Enter the size of pattern (1-10): ");
        row = sc.nextInt();
        System.out.print("Enter the character: ");
        ch = sc.next().charAt(0);
        for (int i = 1; i <= row; i++) {
            for(int j=1;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    //6.Inverted Right angled triangle
    public static void pattern6(){
        int row;
        int column;
        char ch;
        System.out.print("Enter the size of pattern (1-10): ");
        row = sc.nextInt();
        System.out.print("Enter the character: ");
        ch = sc.next().charAt(0);
        for (int i = row; i >= 1; i--) {
            for(int j=1;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    //7.Hoolow Right angled triangled
    public static void pattern7(){
        int row;
        int column;
        char ch;
        System.out.print("Enter the size of pattern (1-10): ");
        row = sc.nextInt();
        System.out.print("Enter the character: ");
        ch = sc.next().charAt(0);
        for (int i = 1; i <= row; i++) {
            for(int j=1;j<=i;j++){
                if(j == 1 || j == i || i == row){
                    System.out.print(ch);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    //8.Rhombus patter
    public static void pattern8(){
        int row;
        int column;
        char ch;

        System.out.print("Enter the size of pattern (1-10): ");
        row = sc.nextInt();
        System.out.print("Enter the character: ");
        ch = sc.next().charAt(0);
        for (int i = 1; i <= row; i++) {
                for(int j=row-i;j>=1;j--){
                    System.out.print(" ");
                }
                for(int j=1;j<=row;j++){
                    System.out.print(ch);
                }
            System.out.println();
            }
        }
    //9.


    public static void main(String[] args) {
//        pattern1();
//        pattern2();
//        pattern3();
//        pattern4();
//        pattern5();
//        pattern6();
//        pattern7();
//        pattern8();
        int rep;
        System.out.print("Enter the number of times to repeat the pattern: ");
        rep=sc.nextInt();
        for(int i=1;i<=rep;i++){
            pattern9();
        }

    }
}
