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
                for(int j=1;j<=row-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=row;j++){
                    System.out.print(ch);
                }
            System.out.println();
            }
        }
    //9.Alphabet Triangle Pattern
    public static void pattern9(){
        int row;
        char col;
        int n;
        System.out.print("Enter the size of pattern (1-10): ");
        n = sc.nextInt();

        for ( row = 1; row <= n; row++) {
            for(col = 'A'; col < 'A' + row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    //10.Inverted Alphabet Triangle Pattern
    public static void pattern10(){
        int row;
        char col;
        int n;
        System.out.print("Enter the size of pattern (1-10): ");
        n = sc.nextInt();

        for ( row = 1; row <= n; row++) {
            for(col = 'A'; col <= 'A' + n - row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }

    }
    //11.Pyramid Pattern
    public static void pattern11(){
        int row;
        int col;
        char ch;
        int n;
        System.out.print("Enter the size of pattern (1-10): ");
        n = sc.nextInt();
        System.out.print("Enter the character: ");
        ch = sc.next().charAt(0);
        for ( row = 1; row <= n; row++) {
            for(int j=1;j<=n-row+1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<2*row;j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    //12.Hollow Pyramid Pattern
    public static void pattern12(){
        int row;
        int col;
        char ch;
        int n;
        System.out.print("Enter the size of pattern (1-10): ");
        n = sc.nextInt();
        System.out.print("Enter the character: ");
        ch = sc.next().charAt(0);
        for ( row = 1; row <= n; row++) {
            for(int j=1;j<=n-row+1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<2*row;k++){
                if(k == 1 || k == 2*row-1 || row == n){
                    System.out.print(ch);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    //13.Symmetric Number Pyramid Pattern
    public static void pattern13(){
        int row;
        int col;
        char ch;
        int n;

        System.out.print("Enter the size of pattern (1-10): ");
        n = sc.nextInt();
        //System.out.print("Enter the character: ");
        //ch = sc.next().charAt(0);
        for ( row = 1; row <= n; row++) {
            int count = 1;
            for(int j=1;j<=n-row+1;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=row;k++){
                {
                    System.out.print(count+" ");
                    count++;
                }
            }
            count-=2;
            for(int i=1;i<row;i++){
                System.out.print(count+" ");
                count--;
            }
            System.out.println();
        }
    }
    //14.Inverted Solid Pyramid Pattern
    public static void pattern14() throws InterruptedException{
        int row;
        int col;
        char ch;
        int n;
        System.out.print("Enter the size of pattern (1-10): ");
        n = sc.nextInt();
        System.out.print("Enter the character: ");
        ch = sc.next().charAt(0);
        for ( row = 1; row <= n; row++) {
            for(int i=1;i<=row-1;i++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*n-2*row+1;j++){
                System.out.print(ch+" ");
            }
            Thread.sleep(1000);
            System.out.println();
        }
    }
    //15.Hollow Rectangle
    public static void pattern15() throws InterruptedException{
        int row;
        int col;

        int n;
        System.out.println("Enter the size of pattern (1-10):");
        System.out.print("Enter the row :");
        int b = sc.nextInt();
        System.out.print("Enter the column :");
        int l = sc.nextInt();

        for ( row = 1; row <= b; row++) {
            for(col = 1; col <= l; col++) {
                if(row == 1 || row ==b || col ==1 || col ==l){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            Thread.sleep(1000);
            System.out.println();
        }

    }

    public static void main(String[] args) throws InterruptedException {
//        pattern1();
//        pattern2();
//        pattern3();
//        pattern4();
//        pattern5();
//        pattern6();
//        pattern7();
//        pattern8();
//        pattern10()
//        pattern11();
//        pattern12();
//        pattern13();
//        pattern14();
//        pattern15();
//        pattern16();
//        pattern17();
//        pattern18();
        int rep;
        System.out.print("Enter the number of times to repeat the pattern: ");
        rep=sc.nextInt();
        for(int i=1;i<=rep;i++){
            pattern15();
        }

    }
}
