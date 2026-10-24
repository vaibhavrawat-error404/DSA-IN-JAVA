import java.util.Scanner;

public class patterns {
    static Scanner sc = new Scanner(System.in);

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

    public static void main(String[] args) {
        //pattern1();
        //pattern2();
        //pattern3();
        int rep;
        System.out.print("Enter the number of times to repeat the pattern: ");
        rep=sc.nextInt();
        for(int i=1;i<=rep;i++){

        }

    }
}
