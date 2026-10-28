import java.util.Scanner;

public class stringPrac {
    static Scanner sc=new Scanner(System.in);
    //reverse the string
    public static void stringReverse(String str){

    }
    //print each char specifically
    public static void strAllChar(String str){
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            System.out.println(ch);
        }
    }

    //count all char of string or count length  without length().
    public static int countLen(String str){
        int count=0;
        char [] arr=str.toCharArray();
        for(char ch: arr){
            count++;
        }
        return count;
    }

    //count vowels in a string
    public static void countVowels(String str){
        int count=0;
        String vowels="aeiouAEIOU";
        for(int i=0;i<str.length();i++){
            for(int j=0;j<vowels.length();j++){
                if(str.charAt(i)==(vowels.charAt(j))){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void main(){

        System.out.print("Enter a string: ");
        String str=sc.nextLine();

        //stringRev(str);
        //strAllChar(str);
//        int count= countLen(str);
//        System.out.println(count);
        //countVowels(str);
    }
}